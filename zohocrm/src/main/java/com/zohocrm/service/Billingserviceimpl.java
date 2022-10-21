package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Billing;
import com.zohocrm.repository.Billingrepository;
@Service
public class Billingserviceimpl implements Billingservice {
@Autowired
private Billingrepository billingrepo;
	@Override
	public void saveonedata(Billing bill) {
		billingrepo.save(bill);
	}

}
