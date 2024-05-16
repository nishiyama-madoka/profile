//package com.example.profileapp;

//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

//public class UserDetailsService {
   
    //public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        //if ("hoge".equals(email)) {
            // ユーザーが存在する場合の処理
            //return new User(email, "HOGE", AuthorityUtils.createAuthorityList("USER"));
        //}
        //throw new UsernameNotFoundException("not found: " + email);
    //}
//}






//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;

//import com.example.profileapp.Person.UserAccount;
//import com.example.profileapp.ProfileMapper;

//public class UserDetailsService implements UserDetails{

	//@Autowired
	//ProfileMapper mapper;
	
	
	    //public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	       // return userRepository.findByEmail(email)  // ユーザー名でユーザー情報を検索
	                //.map(  // Optional型からカスタムなユーザー情報を作成
	                        //user -> new CustomUserDetails(
	                                //user.getEmail(),
	                                //user.getPassword(),
	                               //// Collections.emptyList()
	                        //)
	                //)
	                //.orElseThrow(  // ユーザーが見つからない場合は例外をスロー
	                       // () -> new UsernameNotFoundException(
	                               // "ユーザー情報の認証に失敗しました。 (email = '" + email + "')"
	                        //)
	                //);
	    //}
	
//}
