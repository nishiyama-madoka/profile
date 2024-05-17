package com.example.profileapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig  {
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)
	throws Exception {
		http.csrf().disable();
		http.authorizeHttpRequests(authorize -> {
			authorize
			.requestMatchers("/").permitAll()
			.requestMatchers("/js/**").permitAll()
			.requestMatchers("/css/**").permitAll()
			.requestMatchers("/img/**").permitAll()
			.requestMatchers("/signin").permitAll()
			.requestMatchers("/login").permitAll()
			.requestMatchers("/top").permitAll()
			.anyRequest().authenticated();
		});
		http.formLogin((login) -> {
			login
			//ログイン時使用するデータ
			.usernameParameter("email")
			.passwordParameter("password")
			//ログインページ
			.loginPage("/login")
			//ログイン実行ページ
			.loginProcessingUrl("/login")
			//ログイン失敗時ページ
			.failureUrl("/login?error")
			//ログイン成功時遷移ページ
			.defaultSuccessUrl("/top",true)
			//アクセス権
			.permitAll();
		});
		return http.build();
	}
	
	@Autowired
	private DataSource dataSource;
	
@Bean
public UserDetailsManager userDetailsManager() {
	return new JdbcUserDetailsManager(this.dataSource);
	
}

@Autowired
public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication()
            .dataSource(dataSource)
            .usersByUsernameQuery(
                    "select email, password, self_introduction from users where email = ?")
            .authoritiesByUsernameQuery(
                    "select password, email from users where email = ?")
            .passwordEncoder(new BCryptPasswordEncoder());
}

@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
	


}

//@Autowired
//private AuthenticationProviderImpl authenticationProvider;

//@Autowired
//public void configureGlobal(
  //AuthenticationManagerBuilder auth,
  //@Qualifier("userService") UserDetailsService userDetailsService,
  //PasswordEncoder passwordEncoder) throws Exception {

  //authenticationProvider.setUserDetailsService(userDetailsService);
  //authenticationProvider.setPasswordEncoder(passwordEncoder);
  //auth.eraseCredentials(true)
    //.authenticationProvider(authenticationProvider);
//}


//}
