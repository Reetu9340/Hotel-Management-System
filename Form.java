package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "Form")
	public class Form  implements Serializable {

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		


		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		private static final long serialVersionUID = -3465813074586302847L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		
		@Column
		private String fname;
		
		@Column
		private String lname;
		
		@Column
		private String phonenumber;

		@Column
		private String email;
		
		@Column
		private String dob;
		
		@Column
		private String date;
		
		@Column
		private String guest;
		
		@Column
		private String room;
			

}

