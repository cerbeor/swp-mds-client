package gov.nist.healthcare.iz.cds.swp.mds.client.domain;

public class Forecast {
	
	private String cvx;
	private String latest;
	private String earliest;
	private String recommended;
	private String pastDue;

	
	public Forecast(String cvx, String latest, String earliest, String recommended, String pastDue) {
		super();
		this.cvx = cvx;
		this.latest = latest;
		this.earliest = earliest;
		this.recommended = recommended;
		this.pastDue = pastDue;
	}
	
	public String getCvx() {
		return cvx;
	}
	public void setCvx(String cvx) {
		this.cvx = cvx;
	}
	public String getLatest() {
		return latest;
	}
	public void setLatest(String latest) {
		this.latest = latest;
	}
	public String getEarliest() {
		return earliest;
	}
	public void setEarliest(String earliest) {
		this.earliest = earliest;
	}
	public String getRecommended() {
		return recommended;
	}
	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}
	public String getPastDue() {
		return pastDue;
	}
	public void setPastDue(String pastDue) {
		this.pastDue = pastDue;
	}
}
