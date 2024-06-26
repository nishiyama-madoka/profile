package com.example.profileapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class AppController {
	
	@Autowired
	private ProfileService profileService;
	
	//新規登録画面
	@GetMapping(value = "/signin")
	public String displayAdd(Model model) {
        model.addAttribute("userAddRequest", new UserAddRequest());
        return "/signin";
    }
	
	 @GetMapping(value = "/top")
	    public String displaytop() {
	     
	        return "/top";
	    }
	 
	 
	 @RequestMapping(value = "/signin", method = RequestMethod.POST)
	    public String create(@Validated @ModelAttribute UserAddRequest userRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	             //入力チェックエラーの場合
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "/signin";
	        }
	
	
	// ユーザー情報が登録できた場合
     profileService.save(userRequest);
     return "redirect:/top"; //トップ画面へ遷移するように変更
	 }
	 
	 

	 @RequestMapping("/login")
	 public String displaylogin() {
		 return "/login";
	 }

	 @PostMapping("/login")
	    public String processLogin() {
	        // ログイン処理の実装
	        return "redirect:/top"; // ログイン成功後のリダイレクト先
	    }
	 
	    
}

