
package swp.mds.wsdl.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://swpartners.com}additional_parameters" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}patient"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="asofdate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="base_schedule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="output_careplan" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="output_validated_history" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="output_forecast" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="output_event_queue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "additionalParameters",
    "patient"
})
@XmlRootElement(name = "mds")
public class Mds {

    @XmlElement(name = "additional_parameters")
    protected List<AdditionalParameters> additionalParameters;
    @XmlElement(required = true)
    protected Patient patient;
    @XmlAttribute(name = "asofdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asofdate;
    @XmlAttribute(name = "base_schedule")
    protected String baseSchedule;
    @XmlAttribute(name = "output_careplan")
    protected String outputCareplan;
    @XmlAttribute(name = "output_validated_history")
    protected String outputValidatedHistory;
    @XmlAttribute(name = "output_forecast")
    protected String outputForecast;
    @XmlAttribute(name = "output_event_queue")
    protected String outputEventQueue;

    /**
     * Gets the value of the additionalParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalParameters }
     * 
     * 
     */
    public List<AdditionalParameters> getAdditionalParameters() {
        if (additionalParameters == null) {
            additionalParameters = new ArrayList<AdditionalParameters>();
        }
        return this.additionalParameters;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the asofdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsofdate() {
        return asofdate;
    }

    /**
     * Sets the value of the asofdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsofdate(XMLGregorianCalendar value) {
        this.asofdate = value;
    }

    /**
     * Gets the value of the baseSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSchedule() {
        return baseSchedule;
    }

    /**
     * Sets the value of the baseSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSchedule(String value) {
        this.baseSchedule = value;
    }

    /**
     * Gets the value of the outputCareplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputCareplan() {
        return outputCareplan;
    }

    /**
     * Sets the value of the outputCareplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputCareplan(String value) {
        this.outputCareplan = value;
    }

    /**
     * Gets the value of the outputValidatedHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputValidatedHistory() {
        return outputValidatedHistory;
    }

    /**
     * Sets the value of the outputValidatedHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputValidatedHistory(String value) {
        this.outputValidatedHistory = value;
    }

    /**
     * Gets the value of the outputForecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputForecast() {
        return outputForecast;
    }

    /**
     * Sets the value of the outputForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputForecast(String value) {
        this.outputForecast = value;
    }

    /**
     * Gets the value of the outputEventQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputEventQueue() {
        return outputEventQueue;
    }

    /**
     * Sets the value of the outputEventQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputEventQueue(String value) {
        this.outputEventQueue = value;
    }

}
