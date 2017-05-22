package com.cxcollie.uidrive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cxcollie.uidrive.entity.Drive;

@Repository
public class DriveDAOSqlImpl implements DriveDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveDrive(Drive theDrive) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theDrive);
	}

	@Override
	public Drive getDriveById(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Drive theDrive = currentSession.get(Drive.class, theId);
		return theDrive;
	}

}
