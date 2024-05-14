package com.example.profileapp;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import com.example.profileapp.UserAddRequest;
//import com.example.profileapp.UserRepository;

//public class CustomAbstractUserDetailsAuthenticationProvider {

	//@Autowired
	//private UserRepository userRepository;
	
    // @EnableWebSecurityをつけたconfigクラスにてBCryptPasswordEncoderをBean登録しているので、ここで注入する。
	//@Autowired
	//private BCryptPasswordEncoder bCryptPasswordEncoder;

    // UserDetails に何かしらの追加チェックを行いたい場合はここに実装。今回は要件にないので実装なし。
	//@Override
	//protected void additionalAuthenticationChecks(UserDetails userDetails,
			//EmailPasswordAuthenticationToken authentication) throws AuthenticationException {}

	//@Override
	//protected UserDetails retrieveUser(String email, EmailPasswordAuthenticationToken authentication)
			//throws AuthenticationException {
		//String password = (String) authentication.getCredentials(); // authenticationからpasswordを取得
		//User user = userRepository.findByEmail(email); // emailでDBの検索を行う。
		//if(bCryptPasswordEncoder.matches(password, user1.getPassword())) { // 入力されたパスワードとDBにあったパスワードが一致するか判定
			//return new CustomUserDetails(user); // 一致したらUserDetailsをnewしてreturn
		//}else {
			//throw new UsernameNotFoundException("user not found"); // 一致しなかったらUsernameNotFoundExceptionをスロー
		//}
		
	//}

	
//}
