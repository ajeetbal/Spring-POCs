package com.example.retry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {
	
	@Autowired
	private Service service;
	
	@GetMapping("/retry")
	@ExceptionHandler({ Exception.class })
	public String validateSPringRetryCapability(@RequestParam(required = false) boolean simulateretry,
			@RequestParam(required = false) boolean simulateretryfallback) {
		System.out.println("===============================");
		System.out.println("Inside RestController mathod..");

		return service.getBackendResponse(simulateretry, simulateretryfallback);
	}
}
