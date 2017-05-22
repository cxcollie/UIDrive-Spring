package com.cxcollie.uidrive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driveTable")
public class Drive {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="driveID")
	private int driveID;
	
	@Column(name="startTime")
	private String startTime;
	
	@Column(name="startPositionX")
	private Double startPositionX;
	
	@Column(name="startPositionY")
	private Double startPositionY;
	
	@Column(name="endPositionX")
	private Double endPositionX;
	
	@Column(name="endPositionY")
	private Double endPositionY;
	
	@Column(name="passengerNumber")
	private Integer passengerNumber;
	
	@Column(name="passengerLeft")
	private Integer passengerLeft;
	
	@Column(name="briefInfo")
	private String briefInfo;
	
	@Column(name="driverID")
	private Integer driverID;
	
	@Column(name="verificationCode")
	private String verificationCode;
	
	@Column(name="endPlace")
	private String endPlace;
	
	@Column(name="startPlace")
	private String startPlace;
	
	public Drive() {
		
	}
	
	@Override
	public String toString() {
		return "Drive [driveID=" + driveID + ", startTime=" + startTime + ", driverID=" + driverID + 
				", verificationCode=" + verificationCode + ", endPlace=" + endPlace + ", startPlace=" + startPlace + "]";
	}

	public int getDriveID() {
		return driveID;
	}

	public void setDriveID(int driveID) {
		this.driveID = driveID;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Double getStartPositionX() {
		return startPositionX;
	}

	public void setStartPositionX(Double startPositionX) {
		this.startPositionX = startPositionX;
	}

	public Double getStartPositionY() {
		return startPositionY;
	}

	public void setStartPositionY(Double startPositionY) {
		this.startPositionY = startPositionY;
	}

	public Double getEndPositionX() {
		return endPositionX;
	}

	public void setEndPositionX(Double endPositionX) {
		this.endPositionX = endPositionX;
	}

	public Double getEndPositionY() {
		return endPositionY;
	}

	public void setEndPositionY(Double endPositionY) {
		this.endPositionY = endPositionY;
	}

	public Integer getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public Integer getPassengerLeft() {
		return passengerLeft;
	}

	public void setPassengerLeft(Integer passengerLeft) {
		this.passengerLeft = passengerLeft;
	}

	public String getBriefInfo() {
		return briefInfo;
	}

	public void setBriefInfo(String briefInfo) {
		this.briefInfo = briefInfo;
	}

	public Integer getDriverID() {
		return driverID;
	}

	public void setDriverID(Integer driverID) {
		this.driverID = driverID;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}
}
