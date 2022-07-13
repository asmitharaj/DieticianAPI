package com.ninja.dietician.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.dietician.entity.Morbidity;
import com.ninja.dietician.service.MorbidityService;

@RestController
@RequestMapping("/api")
public class MorbidityController {

	@Autowired
    MorbidityService service;
	
	private String infoType = "Morbidity";

	//get all morbidities
    @GetMapping("/morbidity")
    public ResponseEntity<Iterable<Morbidity>> getAllMorbidties(){
         return ResponseEntity.ok(service.getAllMorbidities(infoType));  
    }
    
   //get all morbidities by morbidity name
  	@GetMapping("/morbidityName/{morbidityName}")
  	public ResponseEntity<List<Morbidity>> getMorbidityByName(@PathVariable(value="morbidityName") String morbidityName) {
  		return ResponseEntity.ok(this.service.getMorbidityByName(infoType, morbidityName));
  	}
  	
  	//get all morbidities by morbidity test id
  	@GetMapping("/morbidityTest/{morbidityTestId}")
  	public ResponseEntity<List<Morbidity>> getMorbidityByTestId(@PathVariable(value="morbidityTestId") String testId) {
  		return ResponseEntity.ok(this.service.getMorbidityByTestId(infoType, testId));
  	}
    
}
