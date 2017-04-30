package springboot.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.rahul.impl.FirstIF;

@RestController
public class FirstController {

	@Autowired
	FirstIF first;
	
	@RequestMapping("/first")
	public String firstMethod(){
		return first.getFirstWelcomeMsg();
	}

}
