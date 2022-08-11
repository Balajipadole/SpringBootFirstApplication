
package com.BikkadIT.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BikkadIT.Response.Flight;
import com.BikkadIT.Response.Flights;

@Service
public class FlightService {


	public List<Flight> getFlightData() {
		
		RestTemplate rt=new RestTemplate();
		
		String url="http://mu.mulesoft-training.com/essentials/united/flights";
		
//		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
//		String body = forEntity.getBody();
//		System.out.println(body);
		
		
		ResponseEntity<Flights> forEntity = rt.getForEntity(url, Flights.class);
		
		Flights body = forEntity.getBody();
		
		List<Flight> flights = body.getFlights();
		
		for(Flight f:  flights) {
			System.out.println(f);
		}
		return flights;
		
	}
}
