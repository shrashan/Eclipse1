package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	 
//Dependency
	
	//we want the spring to inject the instances of the dependency here
	@Autowired
	private WelcomeService service;
		
	@RequestMapping("/Welcome")
	public String Welcome() {
		return service.retrieveWelcomeMessage();
		
	}
}
	//we want spring to manage the bean and create the instances of the bean
@Component	
class WelcomeService{
		public String retrieveWelcomeMessage() {
			
			//complex method
			return"Good Morning";
			
		}
	}
	


