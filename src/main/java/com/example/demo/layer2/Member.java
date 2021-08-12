package com.example.demo.layer2;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the MEMBERS database table.
 * 
 */
@Entity
@Table(name="MEMBERS")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MEMBER_ID")
	private int memberId;

//	@Temporal(TemporalType.DATE)
	@Column(name="MEMBER_DOB")
	private LocalDate memberDob;

	@Column(name="MEMBER_NAME")
	private String memberName;

	@Column(name="MEMBER_PASSPORTNO")
	private String memberPassportno;

	@Column(name="MEMBER_RELATIONSHIP")
	private String memberRelationship;

	//bi-directional many-to-one association to Travel
	@ManyToOne
	@JoinColumn(name="TRAVELID")
	private Travel travel;

	public Member() {
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public LocalDate getMemberDob() {
		return this.memberDob;
	}

	public void setMemberDob(LocalDate memberDob) {
		this.memberDob = memberDob;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPassportno() {
		return this.memberPassportno;
	}

	public void setMemberPassportno(String memberPassportno) {
		this.memberPassportno = memberPassportno;
	}

	public String getMemberRelationship() {
		return this.memberRelationship;
	}

	public void setMemberRelationship(String memberRelationship) {
		this.memberRelationship = memberRelationship;
	}
//
	public int getTravel() {
		return this.travel.getTravelid();
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}