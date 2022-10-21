package com.zohocrm.controllerlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Billing;
import com.zohocrm.service.Billingservice;

@Controller
public class Billingcontroller {
	@Autowired
	private Billingservice billingservice;
	@RequestMapping("/GENERATE_BILL")
	public String GENERATE_BILL(@ModelAttribute("bill") Billing bill) {
	billingservice.saveonedata(bill);
		return"billing_data";	
	}
}
