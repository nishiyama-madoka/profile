package com.example.profileapp;


import java.util.List;

//import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileMapper {

	/**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);
    
    //public User findByName(String name);
    List<Person> findAll();
	
	Person findById(Long id);
	
	
    public Person findByEmail(String email);
}
