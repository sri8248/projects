package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Contacts;
import com.zohocrm.repository.Contactrepository;

@Service
public class Contactserviceimpl implements Contactservice {
@Autowired
private Contactrepository contactrepo;
	@Override
	public void saveonedata(Contacts contact) {
		contactrepo.save(contact);
	}
	@Override
	public List<Contacts> getdata() {
		List<Contacts> findAll = contactrepo.findAll();
		return findAll;
	}
	@Override
	public void deleteoneid(Long id) {
      contactrepo.deleteById(id);		
	}
	@Override
	public Contacts findoneid(Long id) {
        Optional<Contacts> findById = contactrepo.findById(id);
		return findById.get();
	}
	@Override
	public void deletebyid(Long id) {
		contactrepo.deleteById(id);
	}
	@Override
	public Contacts getonebillingdat(Long id) {
		Optional<Contacts> findById = contactrepo.findById(id);
		return findById.get();
	}

}
