package com.example.demo.layer2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the TRAVEL database table.
 * 
 */
@Entity
@Table(name = "travel")
public class Travel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRAVELID")
	private int travelid;

	@Column(name = "NOMINEE_NAME")
	private String nomineeName;

	@Column(name = "NOMINEE_RELATIONSHIP")
	private String nomineeRelationship;

	@Column(name = "TRAVEL_CONTACT")
	private long travelContact;

	@Column(name = "TRAVEL_DESTINATION")
	private String travelDestination;

	@Column(name = "TRAVEL_EMAIL")
	private String travelEmail;

//	@Temporal(TemporalType.DATE)
	@Column(name = "TRAVEL_ENDDATE")
	private LocalDate travelEnddate;

	@Column(name = "TRAVEL_MODEOFTRAVEL")
	private String travelModeoftravel;

	@Column(name = "TRAVEL_NOOFMEMBERS")
	private int travelNoofmembers;

	@Column(name = "TRAVEL_POLICYPLAN")
	private int travelPolicyplan;

//	@Temporal(TemporalType.DATE)
	@Column(name = "TRAVEL_STARTDATE")
	private LocalDate travelStartdate;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "CUST_ID")
	private Customer customer;

	// bi-directional many-to-one association to Member
	@OneToMany(mappedBy = "travel", fetch = FetchType.LAZY)
	private Set<Member> members;

//	//bi-directional one-to-one association to Insurance
	@OneToOne
	@JoinColumn(name="INSURANCE_ID")
	private Insurance insurance;
	
//	@OneToOne(mappedBy = "travel", fetch = FetchType.LAZY)
//	private Insurance insurance;

	public Travel() {
	}

	public int getTravelid() {
		return this.travelid;
	}

	public void setTravelid(int travelid) {
		this.travelid = travelid;
	}

	public String getNomineeName() {
		return this.nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRelationship() {
		return this.nomineeRelationship;
	}

	public void setNomineeRelationship(String nomineeRelationship) {
		this.nomineeRelationship = nomineeRelationship;
	}

	public long getTravelContact() {
		return this.travelContact;
	}

	public void setTravelContact(long travelContact) {
		this.travelContact = travelContact;
	}

	public String getTravelDestination() {
		return this.travelDestination;
	}

	public void setTravelDestination(String travelDestination) {
		this.travelDestination = travelDestination;
	}

	public String getTravelEmail() {
		return this.travelEmail;
	}

	public void setTravelEmail(String travelEmail) {
		this.travelEmail = travelEmail;
	}

	public LocalDate getTravelEnddate() {
		return this.travelEnddate;
	}

	public void setTravelEnddate(LocalDate travelEnddate) {
		this.travelEnddate = travelEnddate;
	}

	public String getTravelModeoftravel() {
		return this.travelModeoftravel;
	}

	public void setTravelModeoftravel(String travelModeoftravel) {
		this.travelModeoftravel = travelModeoftravel;
	}

	public int getTravelNoofmembers() {
		return this.travelNoofmembers;
	}

	public void setTravelNoofmembers(int travelNoofmembers) {
		this.travelNoofmembers = travelNoofmembers;
	}

	public int getTravelPolicyplan() {
		return this.travelPolicyplan;
	}

	public void setTravelPolicyplan(int travelPolicyplan) {
		this.travelPolicyplan = travelPolicyplan;
	}

	public LocalDate getTravelStartdate() {
		return this.travelStartdate;
	}

	public void setTravelStartdate(LocalDate travelStartdate) {
		this.travelStartdate = travelStartdate;
	}

	public Set<Member> getMembers() {
		return this.members;
	}

	public void setMembers(Set<Member> members) {
		this.members = members;
	}

//	public Member addMember(Member member) {
//		getMembers().add(member);
//		member.setTravel(this);
//
//		return member;
//	}
//
//	public Member removeMember(Member member) {
//		getMembers().remove(member);
//		member.setTravel(null);
//
//		return member;
//	}

	public int getCustomer() {
		return this.customer.getCustId();
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
//
	public int getInsurance() {
		return this.insurance.getInsuranceId();
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}