package com.brewerywiki.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	private String id;
	private String name;
	private String nameShortDisplay;
	private String isOrganic;
	private Images images;
	private String status;
	private String statusDisplay;
	private String createDate;
	private String updateDate;
	private String isMassOwned;
	private String isInBusiness;
	private String isVerified;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameShortDisplay() {
		return nameShortDisplay;
	}
	public void setNameShortDisplay(String nameShortDisplay) {
		this.nameShortDisplay = nameShortDisplay;
	}
	public String getIsOrganic() {
		return isOrganic;
	}
	public void setIsOrganic(String isOrganic) {
		this.isOrganic = isOrganic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDisplay() {
		return statusDisplay;
	}
	public void setStatusDisplay(String statusDisplay) {
		this.statusDisplay = statusDisplay;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getIsMassOwned() {
		return isMassOwned;
	}
	public void setIsMassOwned(String isMassOwned) {
		this.isMassOwned = isMassOwned;
	}
	public String getIsInBusiness() {
		return isInBusiness;
	}
	public void setIsInBusiness(String isInBusiness) {
		this.isInBusiness = isInBusiness;
	}
	public String getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public Images getImages() {
		return images;
	}
	public void setImages(Images images) {
		this.images = images;
	}
	
	
	

}
