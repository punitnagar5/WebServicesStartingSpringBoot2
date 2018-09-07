package com.qait.RestWebService2.service;

import org.springframework.stereotype.Component;

//we can write @Service or @Component 
@Component
public class Service {

	public String retrieveMessage()
	{
		return "this service is basically tell us the use of RestController and Services and Autowired annotations";
	}
}
