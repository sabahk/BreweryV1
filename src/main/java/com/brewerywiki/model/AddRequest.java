package com.brewerywiki.model;

public class AddRequest {
	
	public String name;
	public String description;
	public String website;
	public String established;
	public String mailingListUrl;
	public String isOrganic;
	public String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEstablished() {
		return established;
	}
	public void setEstablished(String established) {
		this.established = established;
	}
	public String getMailingListUrl() {
		return mailingListUrl;
	}
	public void setMailingListUrl(String mailingListUrl) {
		this.mailingListUrl = mailingListUrl;
	}
	public String isOrganic() {
		return isOrganic;
	}
	public void setOrganic(String isOrganic) {
		this.isOrganic = isOrganic;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
