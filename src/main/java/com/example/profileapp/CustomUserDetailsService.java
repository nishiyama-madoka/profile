//package com.example.profileapp;

//import java.util.Collections;  // JavaのCollectionsクラスをインポート

//import org.springframework.security.core.userdetails.UserDetails;  // Spring SecurityのUserDetailsをインポート
//import org.springframework.security.core.userdetails.UserDetailsService;  // Spring SecurityのUserDetailsServiceをインポート
//import org.springframework.security.core.userdetails.UsernameNotFoundException;  // ユーザーが見つからなかった場合の例外をインポート
//import org.springframework.stereotype.Service;  // SpringのServiceアノテーションをインポート

//import lombok.RequiredArgsConstructor;  // lombokのRequiredArgsConstructorをインポート

//@Service  // サービスクラスであることを示す@Serviceアノテーション
//@RequiredArgsConstructor  // コンストラクタインジェクションのためのアノテーション
//public class CustomUserDetailsService implements UserDetailsService {

	 //private final UserRepository userRepository;  // UserRepositoryの依存を注入

	    //@Override
	    //public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        //return userRepository.findByEmail(email)  // ユーザー名でユーザー情報を検索
	                //.map(  // Optional型からカスタムなユーザー情報を作成
	                       // user -> new CustomUserDetails(
	                              //  user.getEmail(),
	                               // user.getPassword(),
	                               // Collections.emptyList()
	                        //)
	                //)
	                //.orElseThrow(  // ユーザーが見つからない場合は例外をスロー
	                        //() -> new UsernameNotFoundException(
	                                //"ユーザー情報の認証に失敗しました。 (username = '" + email + "')"
	                        //)
	               // );
	   // }
	
//}
