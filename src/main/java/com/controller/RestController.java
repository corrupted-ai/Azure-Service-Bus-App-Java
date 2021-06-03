package com.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Incoming;
import com.repo.IncomingDAO;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping(value="/")
	public String home(){
		return "Spinner APP Online";
	}
	
	@PostMapping(value="/ServiceBus")
	public String message(@RequestBody Incoming i) throws IOException {
		IncomingDAO id = new IncomingDAO();
		id.callServiceBus(i);
		return "Called Service Bus Successfully";
		
	}

}
