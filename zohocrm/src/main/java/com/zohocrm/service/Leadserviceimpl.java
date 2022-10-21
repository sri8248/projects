package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repository.Leadrepository;
@Service
public class Leadserviceimpl implements Leadservice {
   @Autowired
   private Leadrepository leadrepo;
	@Override
	public void saveonelead(Lead lead) {
		leadrepo.save(lead);
}
	@Override
	public Lead getoneid(long id) {
	  Optional<Lead> findById = leadrepo.findById(id);
		return findById.get();
	
	}
	@Override
	public void deleteoneLead(long id) {
leadrepo.deleteById(id);		
	}
	@Override
	public List<Lead> getalldata() {
		List<Lead> lead = leadrepo.findAll();
		return lead;
	}
	@Override
	public void deletebyid(Long id) {
	leadrepo.deleteById(id);	

	}

}
