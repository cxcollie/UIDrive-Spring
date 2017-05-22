package com.cxcollie.uidrive.dao;

import java.util.List;

import com.cxcollie.uidrive.entity.Drive;

public interface DriveDAO {

	public void saveDrive(Drive theDrive);

	public Drive getDriveById(int theId);

	public List<Drive> getDrivesByEndPlace(String theEndPlace);
}
