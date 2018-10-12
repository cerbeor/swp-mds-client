
package swp.mds.wsdl.domain;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://swpartners.com}series_dose" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maxstartage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dosenum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="eligdate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="mindate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="recommendeddate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="pastduedate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="latedate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="recommended_cvx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="allowable_cvx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is_eligible" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is_min_recommended" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is_recommended" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is_late" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is_past_due" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesDose"
})
@XmlRootElement(name = "series")
public class Series {

    @XmlElement(name = "series_dose")
    protected List<SeriesDose> seriesDose;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "maxstartage")
    protected String maxstartage;
    @XmlAttribute(name = "dosenum")
    protected BigInteger dosenum;
    @XmlAttribute(name = "eligdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eligdate;
    @XmlAttribute(name = "mindate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mindate;
    @XmlAttribute(name = "recommendeddate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recommendeddate;
    @XmlAttribute(name = "pastduedate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pastduedate;
    @XmlAttribute(name = "latedate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latedate;
    @XmlAttribute(name = "recommended_cvx")
    protected String recommendedCvx;
    @XmlAttribute(name = "allowable_cvx")
    protected String allowableCvx;
    @XmlAttribute(name = "is_eligible")
    protected String isEligible;
    @XmlAttribute(name = "is_min_recommended")
    protected String isMinRecommended;
    @XmlAttribute(name = "is_recommended")
    protected String isRecommended;
    @XmlAttribute(name = "is_late")
    protected String isLate;
    @XmlAttribute(name = "is_past_due")
    protected String isPastDue;

    /**
     * Gets the value of the seriesDose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesDose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesDose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesDose }
     * 
     * 
     */
    public List<SeriesDose> getSeriesDose() {
        if (seriesDose == null) {
            seriesDose = new ArrayList<SeriesDose>();
        }
        return this.seriesDose;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the maxstartage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxstartage() {
        return maxstartage;
    }

    /**
     * Sets the value of the maxstartage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxstartage(String value) {
        this.maxstartage = value;
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
     * Gets the value of the eligdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEligdate() {
        return eligdate;
    }

    /**
     * Sets the value of the eligdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEligdate(XMLGregorianCalendar value) {
        this.eligdate = value;
    }

    /**
     * Gets the value of the mindate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMindate() {
        return mindate;
    }

    /**
     * Sets the value of the mindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMindate(XMLGregorianCalendar value) {
        this.mindate = value;
    }

    /**
     * Gets the value of the recommendeddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecommendeddate() {
        return recommendeddate;
    }

    /**
     * Sets the value of the recommendeddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecommendeddate(XMLGregorianCalendar value) {
        this.recommendeddate = value;
    }

    /**
     * Gets the value of the pastduedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPastduedate() {
        return pastduedate;
    }

    /**
     * Sets the value of the pastduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPastduedate(XMLGregorianCalendar value) {
        this.pastduedate = value;
    }

    /**
     * Gets the value of the latedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatedate() {
        return latedate;
    }

    /**
     * Sets the value of the latedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatedate(XMLGregorianCalendar value) {
        this.latedate = value;
    }

    /**
     * Gets the value of the recommendedCvx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedCvx() {
        return recommendedCvx;
    }

    /**
     * Sets the value of the recommendedCvx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedCvx(String value) {
        this.recommendedCvx = value;
    }

    /**
     * Gets the value of the allowableCvx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowableCvx() {
        return allowableCvx;
    }

    /**
     * Sets the value of the allowableCvx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowableCvx(String value) {
        this.allowableCvx = value;
    }

    /**
     * Gets the value of the isEligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEligible() {
        return isEligible;
    }

    /**
     * Sets the value of the isEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEligible(String value) {
        this.isEligible = value;
    }

    /**
     * Gets the value of the isMinRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMinRecommended() {
        return isMinRecommended;
    }

    /**
     * Sets the value of the isMinRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMinRecommended(String value) {
        this.isMinRecommended = value;
    }

    /**
     * Gets the value of the isRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRecommended() {
        return isRecommended;
    }

    /**
     * Sets the value of the isRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRecommended(String value) {
        this.isRecommended = value;
    }

    /**
     * Gets the value of the isLate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLate() {
        return isLate;
    }

    /**
     * Sets the value of the isLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLate(String value) {
        this.isLate = value;
    }

    /**
     * Gets the value of the isPastDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPastDue() {
        return isPastDue;
    }

    /**
     * Sets the value of the isPastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPastDue(String value) {
        this.isPastDue = value;
    }

}
