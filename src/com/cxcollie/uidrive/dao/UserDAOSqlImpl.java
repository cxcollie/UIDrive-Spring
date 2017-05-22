package com.cxcollie.uidrive.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cxcollie.uidrive.entity.AppUser;

@Repository
public class UserDAOSqlImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(AppUser theUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theUser);
	}

	@Override
	public AppUser getUserById(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		AppUser theUser = currentSession.get(AppUser.class, theId);
		return theUser;
	}

	@Override
	public AppUser getUserByLoginPair(String userName, String password) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AppUser> theQuery = 
				currentSession.createQuery("from AppUser where username=:userName AND password=:password", AppUser.class);
		theQuery.setParameter("userName", userName);
		theQuery.setParameter("password", password);
		
		List<AppUser> users = theQuery.getResultList();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Object getUserByUsername(String userName) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AppUser> theQuery = 
				currentSession.createQuery("from AppUser where username=:userName", AppUser.class);
		theQuery.setParameter("userName", userName);
		
		List<AppUser> users = theQuery.getResultList();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

}
