package com.cxcollie.uidrive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cxcollie.uidrive.entity.AppUser;
import com.cxcollie.uidrive.entity.Drive;
import com.cxcollie.uidrive.service.DriveService;
import com.cxcollie.uidrive.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private DriveService driveService;
	
	@GetMapping("/accountPageController")
	public String accountPage(Model theModel) {
		theModel.addAttribute("appUser", new AppUser());
		
		return "login";
	}
	
	@PostMapping("/loginController")
	public String loginPage(Model theModel, @RequestParam("userName") String name,
			@RequestParam("password") String pwd, RedirectAttributes redirectAttrs,
			@ModelAttribute("appUser") AppUser newUser) {
		AppUser loginTry = userService.getUser(name, pwd);
		if (loginTry != null) {
			// verification passed
			redirectAttrs.addFlashAttribute("appUser", loginTry);
			return "redirect:/user-center";
		} else {
			System.out.println("login failed\n"); // 1
			//redirectAttrs.addFlashAttribute("appUser", new AppUser());
			//theModel.addAttribute("appUser", new AppUser());
			return "login";
		}
	}
	
	@PostMapping("/registerController")
	public String registerPage(Model theModel, @ModelAttribute("appUser") AppUser newUser, 
			RedirectAttributes redirectAttrs) {
		boolean registerResult = userService.registerUser(newUser);
		if (registerResult) {
			// register succeed
			redirectAttrs.addFlashAttribute("appUser", newUser);
			return "redirect:/user-center";
		} else {
			return "login";
		}
	}
	
	@GetMapping("/user-center")
	public String userCenter(Model theModel, @ModelAttribute("appUser") AppUser theUser) {
		if (theUser == null) {
			return "redirect:/accountPageController";
		}
		
		if (theUser.getLockedAs() != null && theUser.getLockedAs() != 0) {
			Drive theDrive = driveService.getDriveById(theUser.getDriveID());
			theModel.addAttribute("drive", theDrive);
		} else {
			theModel.addAttribute("drive", new Drive());
		}
		
		return "user-center";
	}
	
	@GetMapping("/searchDriveController")
	public String searchDrive(Model theModel, @ModelAttribute("appUser") AppUser theUser) {
		System.out.println(theUser); // 1
		
		return "search-drive";
	}
	
	@GetMapping("/shareDriveController")
	public String shareDrive(Model theModel, @ModelAttribute("appUser") AppUser theUser) {
		System.out.println(theUser); // 1
		
		return "share-drive";
	}
}
