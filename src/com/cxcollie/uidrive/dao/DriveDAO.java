package com.cxcollie.uidrive.dao;

import com.cxcollie.uidrive.entity.Drive;

public interface DriveDAO {

	public void saveDrive(Drive theDrive);

	public Drive getDriveById(int theId);
}
