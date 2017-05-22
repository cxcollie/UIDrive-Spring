package com.cxcollie.uidrive.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

	@Override
	public List<Drive> getDrivesByEndPlace(String theEndPlace) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Drive> theQuery;
		if ("".equals(theEndPlace)) {
			theQuery = currentSession.createQuery("from Drive", Drive.class);
		} else {
			theQuery = currentSession.createQuery("from Drive where endPlace=:endPlace", Drive.class);
			theQuery.setParameter("endPlace", theEndPlace);
		}
		
		List<Drive> drives = theQuery.getResultList();
		return drives;
	}

}
