package gov.nist.healthcare.iz.cds.swp.mds.client.domain;

import java.util.Date;

public class ValidatedDose extends Dose {

	private boolean status;
	
	public ValidatedDose(String cvx, Date administred, boolean status) {
		super(cvx, administred);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
