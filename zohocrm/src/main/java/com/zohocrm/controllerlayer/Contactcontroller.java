package com.zohocrm.controllerlayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Contactsdata;
import com.zohocrm.entity.Contacts;
import com.zohocrm.service.Contactservice;

@Controller
public class Contactcontroller {
	
	@Value("${test.value:default}")
	private String value;
	@Autowired
	private Contactservice contactservice;
	         
	@RequestMapping("/listcontacts")
            public String listcontacts(ModelMap model) {
            List<Contacts> lead=contactservice.getdata();
            model.addAttribute("leads", lead);
	         return"list_contacts";
	         }
	@RequestMapping("/mail")
	public String composeemail(@RequestParam("email") String email,ModelMap model) {
	model.addAttribute("email",email);
return"compose_contactemail";
	}

	@RequestMapping("/deletecontact")
    public String deletecontact(@RequestParam("id")Long id,ModelMap model) {
    contactservice.deleteoneid(id);
    model.addAttribute("msgg", "contact deleted sucessfully");
    List<Contacts> lead=contactservice.getdata();
    model.addAttribute("leads", lead);
     return"list_contacts";
 
	}
	@RequestMapping("/updatecontact")
    public String updatecontact(@RequestParam("id")Long id,ModelMap model) {
    Contacts contact=contactservice.findoneid(id);
    model.addAttribute("lead", contact);
         return"update_contacts";
 
	}
	@RequestMapping("/update_contact")
    public String update_contact(Contactsdata data, @ModelAttribute("contact")Contacts contact,ModelMap model) {
    Contacts con=new Contacts();
    con.setId(data.getId());
    con.setFirstname(data.getFirstname());
  con.setLastname(data.getLastname());
  con.setMobile(data.getMobile());
  con.setEmail(data.getLastname());
  con.setSource(data.getSource());
  contactservice.saveonedata(con);
  List<Contacts> lead=contactservice.getdata();
  model.addAttribute("leads", lead);
   return"list_contacts";
	}
	@RequestMapping("/billing")
	public String billing(@RequestParam("id")Long id,ModelMap model) {
	Contacts bill = contactservice.getonebillingdat(id);
	model.addAttribute("bill", bill);
	return"billing_data";
	}
	
	
	@GetMapping("/getvalue")
	public String name() {
	return value;
	}
}
