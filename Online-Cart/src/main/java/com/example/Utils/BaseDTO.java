package com.example.Utils;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseDTO {

	private String bloodGroup;
	private String aadharNo;
	private String createdBy;
	private String modifiedBy;	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime modifiedDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
	private String ipAddress;

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "BaseDTO [bloodGroup=" + bloodGroup + ", aadharNo=" + aadharNo + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", createdDate=" + createdDate
				+ ", ipAddress=" + ipAddress + "]";
	}



}
