
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
 *       &lt;attribute name="dosenum" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="admindate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="cvx" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="immunizationid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "series_dose")
public class SeriesDose {

    @XmlAttribute(name = "dosenum", required = true)
    protected BigInteger dosenum;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "admindate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar admindate;
    @XmlAttribute(name = "cvx")
    protected String cvx;
    @XmlAttribute(name = "immunizationid")
    protected String immunizationid;

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
     * Gets the value of the admindate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmindate() {
        return admindate;
    }

    /**
     * Sets the value of the admindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmindate(XMLGregorianCalendar value) {
        this.admindate = value;
    }

    /**
     * Gets the value of the cvx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvx() {
        return cvx;
    }

    /**
     * Sets the value of the cvx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvx(String value) {
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

}
