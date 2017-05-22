package com.cxcollie.uidrive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cxcollie.uidrive.dao.UserDAO;
import com.cxcollie.uidrive.entity.AppUser;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public AppUser getUser(String userName, String password) {
		// verify user
		return userDAO.getUserByLoginPair(userName, password);
	}
	
	@Transactional
	public void saveUser(AppUser theUser) {
		userDAO.saveUser(theUser);
		
	}
	
	@Transactional
	public boolean registerUser(AppUser newUser) {
		String newUserName = newUser.getUserName();
		if (userDAO.getUserByUsername(newUserName) == null) {
			// user is registered
			userDAO.saveUser(newUser);
			return true;
		} else {
			return false;
		}
	}
}
