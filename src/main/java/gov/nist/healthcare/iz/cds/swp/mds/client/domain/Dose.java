package gov.nist.healthcare.iz.cds.swp.mds.client.domain;

import java.util.Date;

public class Dose {
	
	private String cvx;
	private Date administred;
	
	public Dose(String cvx, Date administred) {
		super();
		this.cvx = cvx;
		this.administred = administred;
	}
	public String getCvx() {
		return cvx;
	}
	public void setCvx(String cvx) {
		this.cvx = cvx;
	}
	public Date getAdministred() {
		return administred;
	}
	public void setAdministred(Date administred) {
		this.administred = administred;
	}
	
}
