package gov.nist.healthcare.iz.cds.swp.mds.client.service.impl;

import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Dose;
import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Patient;
import gov.nist.healthcare.iz.cds.swp.mds.client.service.MDSClient;
import swp.mds.wsdl.domain.Careplan;
import swp.mds.wsdl.domain.DoseType;
import swp.mds.wsdl.domain.MDSExecute;
import swp.mds.wsdl.domain.Mds;


public class MDSClientImpl extends WebServiceGatewaySupport implements MDSClient  {

	
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	public MDSClientImpl() {
		super();
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("swp.mds.wsdl.domain");
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}


	@Override
	public Careplan getForecast(String URL, Patient p, Date evalDate, List<Dose> doses, StringWriter logs) throws Exception {
		
		swp.mds.wsdl.domain.Patient patientPayload = new swp.mds.wsdl.domain.Patient();
		patientPayload.setDob(dateToXml(p.getDob()));
		patientPayload.setGender(p.getGender());
		
		List<DoseType> dosesPayload = new ArrayList<>();
		for(Dose dose : doses){
			DoseType tmp = new DoseType();
			tmp.setCvx(new BigInteger(dose.getCvx()));
			tmp.setDate(dateToXml(dose.getAdministred()));
			dosesPayload.add(tmp);
		}
		
		patientPayload.getObservationAndDoseAndCareplan().addAll(dosesPayload);
		
		MDSExecute request = new MDSExecute();
		Mds mds = new Mds();
		mds.setAsofdate(dateToXml(evalDate));
		mds.setOutputCareplan("cdsi_series_select");
		mds.setOutputValidatedHistory("cdsi_series_select");
		mds.setPatient(patientPayload);
		request.setMds(mds);
		logs.write("Sending XML to remote server at : "+URL);
		logs.write("\n\n");
		logs.write(this.toXML(request));
		MDSExecute response = (MDSExecute) getWebServiceTemplate().marshalSendAndReceive(URL, request);
		logs.write("\n\n");
		logs.write("Received XML from remote server at : "+URL);
		logs.write("\n\n");
		logs.write(this.toXML(response));
		
		for(Object o : response.getMds().getPatient().getObservationAndDoseAndCareplan()){
			if(o instanceof Careplan){
				return (Careplan) o;
			}
		}
		return null;
	}

	private XMLGregorianCalendar dateToXml(Date d) throws Exception{
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		date2.setTimezone( DatatypeConstants.FIELD_UNDEFINED );
		return date2;
	}
	
	public String toXML(MDSExecute plan) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(MDSExecute.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        StringWriter sw = new StringWriter();
        marshaller.marshal(plan, sw);
        return sw.toString();
    }
	

}
