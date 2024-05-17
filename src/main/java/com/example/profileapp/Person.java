package com.example.profileapp;
//entity
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class Person implements Serializable {

	@Id
	private Long id;
	
	private String email;
	
	private String name;
	
	private String selfIntroduction;
	
	private String password;
	
	private Date created_at;
	
	private Date updated_at;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// private boolean enabled;
	
	//public record UserAccount(String email,String password,String name) {}
	
	//public boolean isEnabled() {
        //return enabled;
    //}

    //public void setEnabled(boolean enabled) {
        //this.enabled = enabled;
    //}
}

