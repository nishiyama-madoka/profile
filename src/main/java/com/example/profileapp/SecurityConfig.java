package com.example.profileapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity

public class SecurityConfig {
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)
	throws Exception {
		http.csrf().disable();
		http.authorizeHttpRequests(authorize -> {
			authorize.anyRequest().permitAll();
		});
		http.formLogin(form -> {
			form.defaultSuccessUrl("/top")
			.loginPage("/login");
		});
		return http.build();
	}
	
	@Autowired
	private DataSource dataSource;
	
@Bean
public UserDetailsManager userDetailsManager() {
	return new JdbcUserDetailsManager(this.dataSource);
	
}

protected void configure(HttpSecurity http) throws Exception {
    http
      .authorizeRequests().requestMatchers("/login", "/signin").permitAll().anyRequest().authenticated()
      .and()
      .formLogin().loginPage("/login").defaultSuccessUrl("/top")
      .usernameParameter("email")  //usernameの値を"email"から取得するよう設定する
      .passwordParameter("password")
      .and()
      .rememberMe();
  }

@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}




}
