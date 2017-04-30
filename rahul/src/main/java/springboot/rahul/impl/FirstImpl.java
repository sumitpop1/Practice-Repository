package springboot.rahul.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
class FirstImpl implements FirstIF{

	@Autowired
	FirstIF first;
	
	
	@Override
	public String getFirstWelcomeMsg() {
		return "Successful first Rest method using interfaces....";
	}

}
