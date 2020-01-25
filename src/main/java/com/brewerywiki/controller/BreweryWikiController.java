/*package com.brewerywiki.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brewerywiki.model.BreweryResponse;
import com.brewerywiki.model.Data;
import com.brewerywiki.model.DeleteRequest;
import com.brewerywiki.model.DeleteResponse;
import com.brewerywiki.service.BreweryWikiService;


@RestController
@CrossOrigin
public class BreweryWikiController {
	
	//private static final String URI = "/v1/brewerywiki";
	Logger logger = LoggerFactory.getLogger(BreweryWikiController.class);
	
   @Autowired
	BreweryWikiService breweryWikiService;
   
   //To Get all Brewery Information
   
	@GetMapping(value="/v1/brewerywiki/getallinfo/{key}", produces = MediaType.APPLICATION_JSON_VALUE)
		public BreweryResponse getBreweryInfo(@PathVariable("key") int key){
		logger.info("key in controller-->"+key);
		BreweryResponse response=breweryWikiService.getAllBreweryInfo(key);
		logger.info("response in controller-->"+response);
			return response;
		}
	
	 //To Get Brewery Information according to ID
	@GetMapping("/v1/brewerywiki/getbeerinfo/{beerId}")
	public Data getBeerInfoById(@PathVariable("beerId") String beerId){
		return breweryWikiService.getBeerInfo(beerId);
	}
	
	//To Delete Brewery Information according to ID
	@PostMapping("/v1/brewerywiki/delete")
	public DeleteResponse deleteBrewery(@RequestBody DeleteRequest deleteRequest){		
		return breweryWikiService.deleteBrewery(deleteRequest.getBreweryId());
		
	}
	
	
	}
*/



