package com.zohocrm.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class Emailserviceimpl implements Emailservice {

	@Autowired
	private JavaMailSender mailsender;
	@Override
	public void sentemail(String to, String sub, String emailbody) {
      SimpleMailMessage mail=new SimpleMailMessage();
	mail.setTo(to);
	mail.setSubject(sub);
	mail.setText(emailbody);
	mailsender.send(mail);
	}

}
