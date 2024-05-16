package com.example.profileapp;


//import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import com.example.profileapp.Person.UserAccount;

@Mapper
public interface ProfileMapper {

	/**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);
    
    //public User findByName(String name);
	
    public UserAccount getAccount(String email);
}
