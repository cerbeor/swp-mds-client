
package swp.mds.wsdl.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="event_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="event_category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="processed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="event_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="event_label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="antigen_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="series_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dosenum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="cvx" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="immunizationid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="cvx_list" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="set_id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="condition_id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "event")
public class Event {

    @XmlAttribute(name = "event_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlAttribute(name = "event_category", required = true)
    protected String eventCategory;
    @XmlAttribute(name = "priority")
    protected BigInteger priority;
    @XmlAttribute(name = "processed")
    protected BigInteger processed;
    @XmlAttribute(name = "event_type")
    protected String eventType;
    @XmlAttribute(name = "event_label")
    protected String eventLabel;
    @XmlAttribute(name = "antigen_name")
    protected String antigenName;
    @XmlAttribute(name = "series_name")
    protected String seriesName;
    @XmlAttribute(name = "dosenum")
    protected BigInteger dosenum;
    @XmlAttribute(name = "cvx")
    protected BigInteger cvx;
    @XmlAttribute(name = "immunizationid")
    protected String immunizationid;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "state")
    protected BigInteger state;
    @XmlAttribute(name = "cvx_list")
    protected String cvxList;
    @XmlAttribute(name = "set_id")
    protected BigInteger setId;
    @XmlAttribute(name = "condition_id")
    protected BigInteger conditionId;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategory(String value) {
        this.eventCategory = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the processed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessed() {
        return processed;
    }

    /**
     * Sets the value of the processed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessed(BigInteger value) {
        this.processed = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventLabel() {
        return eventLabel;
    }

    /**
     * Sets the value of the eventLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventLabel(String value) {
        this.eventLabel = value;
    }

    /**
     * Gets the value of the antigenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntigenName() {
        return antigenName;
    }

    /**
     * Sets the value of the antigenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntigenName(String value) {
        this.antigenName = value;
    }

    /**
     * Gets the value of the seriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * Sets the value of the seriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * Gets the value of the dosenum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDosenum() {
        return dosenum;
    }

    /**
     * Sets the value of the dosenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDosenum(BigInteger value) {
        this.dosenum = value;
    }

    /**
     * Gets the value of the cvx property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCvx() {
        return cvx;
    }

    /**
     * Sets the value of the cvx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCvx(BigInteger value) {
        this.cvx = value;
    }

    /**
     * Gets the value of the immunizationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmunizationid() {
        return immunizationid;
    }

    /**
     * Sets the value of the immunizationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmunizationid(String value) {
        this.immunizationid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setState(BigInteger value) {
        this.state = value;
    }

    /**
     * Gets the value of the cvxList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvxList() {
        return cvxList;
    }

    /**
     * Sets the value of the cvxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvxList(String value) {
        this.cvxList = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetId(BigInteger value) {
        this.setId = value;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConditionId(BigInteger value) {
        this.conditionId = value;
    }

}
