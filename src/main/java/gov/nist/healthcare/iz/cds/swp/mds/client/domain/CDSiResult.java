package gov.nist.healthcare.iz.cds.swp.mds.client.domain;

import java.util.List;

public class CDSiResult {
	
	private List<ValidatedDose> doses;
	private List<Forecast> forecasts;
	
	public List<ValidatedDose> getDoses() {
		return doses;
	}
	public void setDoses(List<ValidatedDose> doses) {
		this.doses = doses;
	}
	public List<Forecast> getForecasts() {
		return forecasts;
	}
	public void setForecasts(List<Forecast> forecasts) {
		this.forecasts = forecasts;
	}
	
	
}
