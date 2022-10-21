package com.zohocrm.controllerlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.emailservice.Emailservice;

@Controller
public class Emailcontroller {
	@Autowired
	private Emailservice emailservice;
@RequestMapping("/emailsent")
public String emailsent(@RequestParam("to")String to,@RequestParam("sub")String sub,@RequestParam("emailbody")String emailbody) {
        emailservice.sentemail(to,sub,emailbody);
	
	return"compose_email";	
}
}
