package com.cxcollie.uidrive.dao;

import com.cxcollie.uidrive.entity.AppUser;

public interface UserDAO {

	public void saveUser(AppUser theUser);

	public AppUser getUser(int theId);
}
