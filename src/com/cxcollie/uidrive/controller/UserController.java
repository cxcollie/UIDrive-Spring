package com.cxcollie.uidrive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cxcollie.uidrive.entity.AppUser;
import com.cxcollie.uidrive.entity.Drive;
import com.cxcollie.uidrive.service.DriveService;
import com.cxcollie.uidrive.service.UserService;

@Controller
@SessionAttributes("appUser")
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
	public String loginPage(Model theModel, @RequestParam("loginUserName") String name,
			@RequestParam("loginPassword") String pwd, @ModelAttribute("appUser") AppUser newUser) {
		AppUser loginTry = userService.getUser(name, pwd);
		if (loginTry != null) {
			// verification passed
			theModel.addAttribute("appUser", loginTry);
			return "redirect:/user-center";
		} else {
			return "login";
		}
	}
	
	@PostMapping("/registerController")
	public String registerPage(Model theModel, @ModelAttribute("appUser") AppUser newUser) {
		boolean registerResult = userService.registerUser(newUser);
		if (registerResult) {
			// register succeed
			return "redirect:/user-center";
		} else {
			// register failed
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
		List<Drive> availableDrives = driveService.getDrives();
		theModel.addAttribute("availableDrives", availableDrives);
		
		return "search-drive";
	}
	
	@GetMapping("/shareDriveController")
	public String shareDrive(Model theModel, @ModelAttribute("appUser") AppUser theUser) {
		
		return "share-drive";
	}
	
	@GetMapping("/confirmBookController")
	public String bookDrive(Model theModel, @ModelAttribute("appUser") AppUser theUser, 
			@RequestParam("bookedDriveID") int theBookedDriveID) {

		return "redirect:/user-center";
	}
}
