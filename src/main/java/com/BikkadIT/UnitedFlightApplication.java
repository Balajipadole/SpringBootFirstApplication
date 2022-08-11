package com.BikkadIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.service.FlightService;

@SpringBootApplication
public class UnitedFlightApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(UnitedFlightApplication.class, args);
//		
//	FlightService flightservice = context.getBean(FlightService.class);
//	
//        flightservice.getFlightData();
}

}
