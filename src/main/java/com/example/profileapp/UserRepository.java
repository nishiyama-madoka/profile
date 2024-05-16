package com.example.profileapp;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {
	@Select("select email,password from users where email = #{email}")
    Optional<Person> findByEmail(String email);
}
