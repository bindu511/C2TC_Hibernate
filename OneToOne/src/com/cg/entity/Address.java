package com.cg.entity;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
    import javax.persistence.Table;

	@Entity
	
	
		public class Address implements Serializable {
		
		private static final long SerialVersiononUID=1L;
		@Id
		//@GeneratedValue(strategy=GenerationType.AUTO)
		private int address_id;
		
		@Column(name="address_street")
		private String street;
		
		@Column(name="address_city")
		private String city;
		
		@Column(name="address_state")
		private String State;
		
		@Column(name="address_zip")
		private String zip;
		
		public int getAddress_id() {
			return address_id;
		}
		public void setAddress_id(int address_id) {
			this.address_id = address_id;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		}
	



