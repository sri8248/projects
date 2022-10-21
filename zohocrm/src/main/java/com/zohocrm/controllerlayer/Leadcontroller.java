package com.zohocrm.controllerlayer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Leaddata;
import com.zohocrm.entity.Contacts;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.Contactservice;
import com.zohocrm.service.Leadservice;

@Controller
public class Leadcontroller {
	@RequestMapping("/viewpage")
public String viewpage(){
		return"create_lead";
	}
	@Autowired
	private Leadservice leadservice;
	@RequestMapping("/save")
	public String saveonelead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadservice.saveonelead(lead);
		model.addAttribute("leads",lead);
		return"lead_info";
		}
	@RequestMapping("/composemail")
	public String composeemail(@RequestParam("email") String email,ModelMap model) {
	model.addAttribute("email",email);
return"compose_email";
	}
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/convert_lead")
	public String convert_lead(@RequestParam("id")long id,ModelMap model) {
		System.out.println(id);
	   Lead lead = leadservice.getoneid(id);
		Contacts contact=new Contacts();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactservice.saveonedata(contact);
	     leadservice.deleteoneLead(id);
	     System.out.println("lead deleted");
	   List<Contacts> getdata = contactservice.getdata();
	   System.out.println("method in");
       model.addAttribute("leads",getdata);
       System.out.println("return problem");
        return"list_contacts";
      }
	@RequestMapping("/listall")
	public String listall(ModelMap model) {
	List<Lead> leads=leadservice.getalldata();
	model.addAttribute("leads", leads);
		return "list_all";
		
	}
	@RequestMapping("/findid")
	public String getdata(@RequestParam("id")Long id,ModelMap model) {
		Lead leads = leadservice.getoneid(id);
		model.addAttribute("lead",leads);
	return"lead_info";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("id")Long id,ModelMap model) {
		System.out.println(id);
		Lead leads = leadservice.getoneid(id);
		model.addAttribute("lead",leads);
		return"update_lead";
	}
	@RequestMapping("/update_lead")
	public String update_lead(Leaddata data,@ModelAttribute("Lead")Lead lead,ModelMap model) {
	    Lead le=new Lead();
	le.setId(data.getId());
	le.setFirstname(data.getFirstname());
	le.setLastname(data.getLastname());
	le.setEmail(data.getEmail());
	le.setMobile(data.getMobile());
	le.setSource(data.getSource());
	leadservice.saveonelead(le);
	model.addAttribute("lead",lead);
	return"lead_info";
	}
	@RequestMapping("/Delete")
	public String delete(@RequestParam("id")Long id,ModelMap model) {
		 leadservice.deletebyid(id);
		 List<Lead> leads=leadservice.getalldata();
			model.addAttribute("leads", leads);
				return "list_all";
	}
	
	
}