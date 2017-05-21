package com.cxcollie.uidrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxcollie.uidrive.entity.AppUser;
import com.cxcollie.uidrive.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/loginController")
	public String userLogin(Model theModel) {
		theModel.addAttribute("appUser", new AppUser());
		
		return "login";
	}
	
	@PostMapping("/userCenterController")
	public String userCenter(@ModelAttribute("appUser") AppUser theUser) {
		userService.getUser(theUser);
		
		return "user-center";
	}
}
