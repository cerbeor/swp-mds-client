package gov.nist.healthcare.iz.cds.swp.mds.client.service;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Dose;
import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Patient;
import swp.mds.wsdl.domain.Careplan;

public interface MDSClient {

	public Careplan getForecast(String URL, Patient p, Date evalDate, List<Dose> doses) throws Exception;
	
}
