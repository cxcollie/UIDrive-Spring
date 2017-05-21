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
	public AppUser getUser(AppUser theUser) {
		// verify and save user
		return userDAO.getUser(theUser.getId());
	}
	
	@Transactional
	public void saveUser(AppUser theUser) {
		userDAO.saveUser(theUser);
		
	}
}
