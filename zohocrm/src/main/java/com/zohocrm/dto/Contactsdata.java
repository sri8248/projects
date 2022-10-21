
package com.zohocrm.dto;





public class Contactsdata{
	private long id;
	private String firstname;
	private String lastname;
	private long  mobile;
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
		public void setId(int id) {
			this.id = id;
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


