package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Contacts;

public interface Contactservice {

public	void saveonedata(Contacts contact);

public List<Contacts> getdata();

public void deleteoneid(Long id);

public Contacts findoneid(Long id);

public void deletebyid(Long id);

public Contacts getonebillingdat(Long id);


}
