package com.example.profileapp;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileMapper {

	/**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);
	
}
