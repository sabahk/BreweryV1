package com.brewerywiki.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.brewerywiki.model.BrewResponse;
import com.brewerywiki.model.BreweryResponse;
import com.brewerywiki.model.Data;
//import com.brewerywiki.repo.BreweryRepo;
import com.brewerywiki.model.DeleteResponse;

//@Service
public class BreweryWikiService {
	
	//@Autowired
	RestTemplate restTemplate=new RestTemplate();
	
	Logger logger = LoggerFactory.getLogger(BreweryWikiService.class);
	
	// BreweryRepo breweryRepo;

	

	public BreweryResponse getAllBreweryInfo(String key) {
		BreweryResponse response=new BreweryResponse();
		
		 try {
			 response=restTemplate.getForObject("https://sandbox-api.brewerydb.com/v2/breweries/?key="+key, BreweryResponse.class);
			 logger.info("Response recieved-->"+response);
		} catch (Exception e) {
			
			logger.error("Error occured-->"+e);

		}
		return response;
	}
	
	public BrewResponse getBeerInfo(String beerId) {
		BrewResponse response=new BrewResponse();
		
		 try {
			 response=restTemplate.getForObject("https://sandbox-api.brewerydb.com/v2/brewery/"+beerId+"/?key=a3c039623e662e0732e5362e5e516f55", BrewResponse.class);
		} catch (Exception e) {
			
			logger.error("Error occured-->"+e);

		}
		return response;
	}
	
	public DeleteResponse deleteBrewery(String breweryId) {
		DeleteResponse response=new DeleteResponse();
		
		 try {
			restTemplate.delete("https://sandbox-api.brewerydb.com/v2/brewery/"+breweryId+"/?key=a3c039623e662e0732e5362e5e516f55");
			response.setStatus("success");
		} catch (Exception e) {
			
			logger.error("Error occured-->"+e);

		}
		 return response;
		
	}
}
