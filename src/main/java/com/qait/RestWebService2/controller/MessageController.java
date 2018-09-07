package com.qait.RestWebService2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qait.RestWebService2.service.Service;

@RestController
public class MessageController {

	@Autowired
	private Service service;
	
	@RequestMapping("/welcomes")
	
	public String welcome()
	{
		return service.retrieveMessage();
	}
}
