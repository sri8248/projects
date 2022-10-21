package com.zohocrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="leads")
public class Lead {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	@Column(name="first_name",length=55,nullable=false)
private String firstname;
	@Column(name="last_name",length=60,nullable=false)
private String lastname;
	@Column(name="mobile_number",length=60,unique=true)
private long  mobile;
	@Column(name="email",length=60,unique=true)
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String source;
public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}


}
