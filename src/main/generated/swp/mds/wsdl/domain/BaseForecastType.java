
package swp.mds.wsdl.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for baseForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dosenum" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="eligdate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="mindate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="recommendeddate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="pastduedate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="latedate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="recommended_cvx" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="allowable_cvx" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseForecastType")
@XmlSeeAlso({
    ForecastType.class,
    GroupedForecastType.class
})
public class BaseForecastType {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "dosenum", required = true)
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
    @XmlAttribute(name = "recommended_cvx", required = true)
    protected String recommendedCvx;
    @XmlAttribute(name = "allowable_cvx", required = true)
    protected String allowableCvx;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

}
