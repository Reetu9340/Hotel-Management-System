package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name = "Signup")
	public class Signup  implements Serializable {

		private static final long serialVersionUID = -3465813074586302847L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		
		@Column
		private String username;
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		@Column
		private String fname;
		
		@Column
		private String lname;
		
		@Column
		private String phonenumber;
		
		@Column
		private String dob;

		@Column
		private String email;
		
		@Column
		private String password;
		
		@Column
		private String rpassword;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRpassword() {
			return rpassword;
		}

		public void setRpassword(String rpassword) {
			this.rpassword = rpassword;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		

}



