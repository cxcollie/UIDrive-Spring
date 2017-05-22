package com.cxcollie.uidrive.dao;

import com.cxcollie.uidrive.entity.AppUser;

public interface UserDAO {

	public void saveUser(AppUser theUser);

	public AppUser getUserById(int theId);
	
	public AppUser getUserByLoginPair(String userName, String password);

	public Object getUserByUsername(String userName);
}
