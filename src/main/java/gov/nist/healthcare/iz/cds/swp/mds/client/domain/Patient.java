package gov.nist.healthcare.iz.cds.swp.mds.client.domain;

import java.util.Date;

public class Patient {
	
	private String gender;
	private Date dob;
	
	public Patient(String gender, Date dob) {
		super();
		this.gender = gender;
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
