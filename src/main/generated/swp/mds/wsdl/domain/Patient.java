
package swp.mds.wsdl.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://swpartners.com}observation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}dose" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}careplan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}validated_dose" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}forecast" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}grouped_forecast" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://swpartners.com}event_queue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dob" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "observationAndDoseAndCareplan"
})
@XmlRootElement(name = "patient")
public class Patient {

    @XmlElements({
        @XmlElement(name = "observation", type = Observation.class),
        @XmlElement(name = "dose", type = DoseType.class),
        @XmlElement(name = "careplan", type = Careplan.class),
        @XmlElement(name = "validated_dose", type = ValidatedDoseType.class),
        @XmlElement(name = "forecast", type = ForecastType.class),
        @XmlElement(name = "grouped_forecast", type = GroupedForecastType.class),
        @XmlElement(name = "event_queue", type = EventQueue.class)
    })
    protected List<Object> observationAndDoseAndCareplan;
    @XmlAttribute(name = "dob", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlAttribute(name = "gender")
    protected String gender;

    /**
     * Gets the value of the observationAndDoseAndCareplan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationAndDoseAndCareplan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationAndDoseAndCareplan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Observation }
     * {@link DoseType }
     * {@link Careplan }
     * {@link ValidatedDoseType }
     * {@link ForecastType }
     * {@link GroupedForecastType }
     * {@link EventQueue }
     * 
     * 
     */
    public List<Object> getObservationAndDoseAndCareplan() {
        if (observationAndDoseAndCareplan == null) {
            observationAndDoseAndCareplan = new ArrayList<Object>();
        }
        return this.observationAndDoseAndCareplan;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
