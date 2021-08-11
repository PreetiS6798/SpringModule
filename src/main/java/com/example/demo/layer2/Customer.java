package com.example.demo.layer2;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@Table(name="customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_ID")
	private int custId;

	@Column(name="CUST_CONTACTNUMBER")
	private String custContactnumber;

	@Column(name="CUST_EMAIL")
	private String custEmail;

	@Column(name="CUST_FIRSTNAME")
	private String custFirstname;

	@Column(name="CUST_LASTNAME")
	private String custLastname;

	@Column(name="CUST_PASSWORD")
	private String custPassword;

	//bi-directional many-to-one association to Insurance
	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY)
	private Set<Insurance> insurances;

//	//bi-directional many-to-one association to Travel
//	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY)
//	private Set<Travel> travels;
//
//	//bi-directional many-to-one association to Vehicle
//	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY)
//	private Set<Vehicle> vehicles;

	public Customer() {
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustContactnumber() {
		return this.custContactnumber;
	}

	public void setCustContactnumber(String custContactnumber) {
		this.custContactnumber = custContactnumber;
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustFirstname() {
		return this.custFirstname;
	}

	public void setCustFirstname(String custFirstname) {
		this.custFirstname = custFirstname;
	}

	public String getCustLastname() {
		return this.custLastname;
	}

	public void setCustLastname(String custLastname) {
		this.custLastname = custLastname;
	}

	public String getCustPassword() {
		return this.custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public Set<Insurance> getInsurances() {
		return this.insurances;
	}

	public void setInsurances(Set<Insurance> insurances) {
		this.insurances = insurances;
	}

//	public Insurance addInsurance(Insurance insurance) {
//		getInsurances().add(insurance);
//		insurance.setCustomer(this);
//
//		return insurance;
//	}
//
//	public Insurance removeInsurance(Insurance insurance) {
//		getInsurances().remove(insurance);
//		insurance.setCustomer(null);
//
//		return insurance;
//	}

//	public Set<Travel> getTravels() {
//		return this.travels;
//	}
//
//	public void setTravels(Set<Travel> travels) {
//		this.travels = travels;
//	}

//	public Travel addTravel(Travel travel) {
//		getTravels().add(travel);
//		travel.setCustomer(this);
//
//		return travel;
//	}
//
//	public Travel removeTravel(Travel travel) {
//		getTravels().remove(travel);
//		travel.setCustomer(null);
//
//		return travel;
//	}

//	public Set<Vehicle> getVehicles() {
//		return this.vehicles;
//	}
//
//	public void setVehicles(Set<Vehicle> vehicles) {
//		this.vehicles = vehicles;
//	}

//	public Vehicle addVehicle(Vehicle vehicle) {
//		getVehicles().add(vehicle);
//		vehicle.setCustomer(this);
//
//		return vehicle;
//	}
//
//	public Vehicle removeVehicle(Vehicle vehicle) {
//		getVehicles().remove(vehicle);
//		vehicle.setCustomer(null);
//
//		return vehicle;
//	}

}