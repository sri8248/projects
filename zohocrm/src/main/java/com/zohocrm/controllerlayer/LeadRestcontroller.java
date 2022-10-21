package com.zohocrm.controllerlayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entity.Lead;
import com.zohocrm.service.Leadservice;

@RestController
@RequestMapping("/api/lead")
public class LeadRestcontroller {
	@Autowired
	private Leadservice leadservice;
	@Value("${spring.values}")
	private String datasource;
	@GetMapping("/api")
	public String datathings() {
		return datasource;
	}
	
	@GetMapping
public List<Lead> getallLeads(){
	List<Lead> leads = leadservice.getalldata();
return leads;
}
	@PostMapping
	public void saveoneLead(@RequestBody Lead lead) {
	leadservice.saveonelead(lead);	
	}
	@DeleteMapping("/delete/{id}")
	public void deletebyid(@PathVariable("id") long id) {
		leadservice.deletebyid(id);
	}
	@PutMapping
	public void update_lead(@RequestBody Lead lead) {
	    	leadservice.saveonelead(lead);	
	}
	@GetMapping("/get/{id}")
	public Lead getdata(@PathVariable("id")Long id) {
		Lead leads = leadservice.getoneid(id);
		return leads;
	}
}
