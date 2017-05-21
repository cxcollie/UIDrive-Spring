package com.cxcollie.uidrive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserInfo")
public class AppUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="lockedAs")
	private String lockedAs;
	
	@Column(name="driveID")
	private String driveID;
	
	@Column(name="eventTime")
	private String eventTime;
	
	public AppUser() {
		
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + 
				", password=" + password + ", lockedAs=" + lockedAs + ", driveID=" + driveID + ", eventTime=" + eventTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLockedAs() {
		return lockedAs;
	}

	public void setLockedAs(String lockedAs) {
		this.lockedAs = lockedAs;
	}

	public String getDriveID() {
		return driveID;
	}

	public void setDriveID(String driveID) {
		this.driveID = driveID;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
}
