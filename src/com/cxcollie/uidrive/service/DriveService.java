package com.cxcollie.uidrive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cxcollie.uidrive.dao.DriveDAO;
import com.cxcollie.uidrive.entity.Drive;

@Service
public class DriveService {

	@Autowired
	private DriveDAO driveDAO;
	
	@Transactional
	public Drive getDriveById(int driveId) {
		return driveDAO.getDriveById(driveId);
	}
	
	@Transactional
	public void saveDrive(Drive theDrive) {
		driveDAO.saveDrive(theDrive);
	}
}
