package gov.nist.healthcare.iz.cds.swp.mds.client.service.impl;


import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Dose;
import gov.nist.healthcare.iz.cds.swp.mds.client.domain.Patient;
import swp.mds.wsdl.domain.Careplan;
import swp.mds.wsdl.domain.MDSExecute;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("swp.mds.wsdl.domain");
		return marshaller;
	}

	@Bean
	public MDSClientImpl countryClient(Jaxb2Marshaller marshaller) {
		MDSClientImpl client = new MDSClientImpl();
		client.setDefaultUri("http://localhost:8080/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	CommandLineRunner lookup(MDSClientImpl mds) {
		return args -> {
			Patient p = new Patient("M", new Date());
			Date d = new Date();
			Careplan careplan = mds.getForecast("http://testws.swpartners.com/mdsservice/mds", p, new Date(), Arrays.asList(new Dose("110", d), new Dose("110", d)));
			ObjectMapper mapper = new ObjectMapper();
			System.out.println(mapper.writeValueAsString(careplan));
//			System.err.println(response.getCountry().getCurrency());
		};
	}

}