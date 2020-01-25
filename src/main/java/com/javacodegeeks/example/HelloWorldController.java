package com.javacodegeeks.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brewerywiki.model.BrewResponse;
import com.brewerywiki.model.BreweryResponse;
import com.brewerywiki.model.Data;
import com.brewerywiki.model.DeleteRequest;
import com.brewerywiki.model.DeleteResponse;
import com.brewerywiki.service.BreweryWikiService;

@RestController
public class HelloWorldController {
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Java Code Geeks!";
	}
	
	//Brew..
	
	BreweryWikiService breweryWikiService=new BreweryWikiService();
   
   //To Get all Brewery Information
   
	@GetMapping(value="/v1/brewerywiki/getallinfo/{key}", produces = MediaType.APPLICATION_JSON_VALUE)
		public BreweryResponse getBreweryInfo(@PathVariable("key") String key){
		logger.info("key in controller-->"+key);
		BreweryResponse response=breweryWikiService.getAllBreweryInfo(key);
		logger.info("response in controller-->"+response);
			return response;
		}
	
	 //To Get Brewery Information according to ID
	@GetMapping("/v1/brewerywiki/getbeerinfo/{beerId}")
	public BrewResponse getBeerInfoById(@PathVariable("beerId") String beerId){
		return breweryWikiService.getBeerInfo(beerId);
	}
	
	//To Delete Brewery Information according to ID
	@PostMapping("/v1/brewerywiki/delete")
	public DeleteResponse deleteBrewery(@RequestBody DeleteRequest deleteRequest){		
		return breweryWikiService.deleteBrewery(deleteRequest.getBreweryId());
		
	}
}
