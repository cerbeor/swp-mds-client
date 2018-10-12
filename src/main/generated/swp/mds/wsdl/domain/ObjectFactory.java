
package swp.mds.wsdl.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the swp.mds.wsdl.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dose_QNAME = new QName("http://swpartners.com", "dose");
    private final static QName _ValidatedDose_QNAME = new QName("http://swpartners.com", "validated_dose");
    private final static QName _Forecast_QNAME = new QName("http://swpartners.com", "forecast");
    private final static QName _GroupedForecast_QNAME = new QName("http://swpartners.com", "grouped_forecast");
    private final static QName _Value_QNAME = new QName("http://swpartners.com", "value");
    private final static QName _MDSExecuteFault_QNAME = new QName("http://swpartners.com", "MDSExecuteFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: swp.mds.wsdl.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MDSExecute }
     * 
     */
    public MDSExecute createMDSExecute() {
        return new MDSExecute();
    }

    /**
     * Create an instance of {@link Mds }
     * 
     */
    public Mds createMds() {
        return new Mds();
    }

    /**
     * Create an instance of {@link AdditionalParameters }
     * 
     */
    public AdditionalParameters createAdditionalParameters() {
        return new AdditionalParameters();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link DoseType }
     * 
     */
    public DoseType createDoseType() {
        return new DoseType();
    }

    /**
     * Create an instance of {@link Careplan }
     * 
     */
    public Careplan createCareplan() {
        return new Careplan();
    }

    /**
     * Create an instance of {@link Antigen }
     * 
     */
    public Antigen createAntigen() {
        return new Antigen();
    }

    /**
     * Create an instance of {@link Series }
     * 
     */
    public Series createSeries() {
        return new Series();
    }

    /**
     * Create an instance of {@link SeriesDose }
     * 
     */
    public SeriesDose createSeriesDose() {
        return new SeriesDose();
    }

    /**
     * Create an instance of {@link ValidatedDoseType }
     * 
     */
    public ValidatedDoseType createValidatedDoseType() {
        return new ValidatedDoseType();
    }

    /**
     * Create an instance of {@link ForecastType }
     * 
     */
    public ForecastType createForecastType() {
        return new ForecastType();
    }

    /**
     * Create an instance of {@link GroupedForecastType }
     * 
     */
    public GroupedForecastType createGroupedForecastType() {
        return new GroupedForecastType();
    }

    /**
     * Create an instance of {@link EventQueue }
     * 
     */
    public EventQueue createEventQueue() {
        return new EventQueue();
    }

    /**
     * Create an instance of {@link EventQueueDetail }
     * 
     */
    public EventQueueDetail createEventQueueDetail() {
        return new EventQueueDetail();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Nextvisitdate }
     * 
     */
    public Nextvisitdate createNextvisitdate() {
        return new Nextvisitdate();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link MDSExecuteFault }
     * 
     */
    public MDSExecuteFault createMDSExecuteFault() {
        return new MDSExecuteFault();
    }

    /**
     * Create an instance of {@link BaseForecastType }
     * 
     */
    public BaseForecastType createBaseForecastType() {
        return new BaseForecastType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "dose")
    public JAXBElement<DoseType> createDose(DoseType value) {
        return new JAXBElement<DoseType>(_Dose_QNAME, DoseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatedDoseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "validated_dose")
    public JAXBElement<ValidatedDoseType> createValidatedDose(ValidatedDoseType value) {
        return new JAXBElement<ValidatedDoseType>(_ValidatedDose_QNAME, ValidatedDoseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "forecast")
    public JAXBElement<ForecastType> createForecast(ForecastType value) {
        return new JAXBElement<ForecastType>(_Forecast_QNAME, ForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "grouped_forecast")
    public JAXBElement<GroupedForecastType> createGroupedForecast(GroupedForecastType value) {
        return new JAXBElement<GroupedForecastType>(_GroupedForecast_QNAME, GroupedForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDSExecuteFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpartners.com", name = "MDSExecuteFault")
    public JAXBElement<MDSExecuteFault> createMDSExecuteFault(MDSExecuteFault value) {
        return new JAXBElement<MDSExecuteFault>(_MDSExecuteFault_QNAME, MDSExecuteFault.class, null, value);
    }

}
