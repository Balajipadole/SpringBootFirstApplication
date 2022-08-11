package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Response.Flight;
import com.BikkadIT.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping(value="/getflights" ,produces = "application/json")
	public ResponseEntity<List<Flight>> getflights(){
		
		List<Flight> flightData = flightService.getFlightData();
		return new ResponseEntity<List<Flight>>(flightData,HttpStatus.OK);
	}
	
}
