
package swp.mds.wsdl.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validatedDoseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validatedDoseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://swpartners.com}doseType"&gt;
 *       &lt;attribute name="antigen_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="series_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dosenum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validatedDoseType")
public class ValidatedDoseType
    extends DoseType
{

    @XmlAttribute(name = "antigen_name")
    protected String antigenName;
    @XmlAttribute(name = "series_name")
    protected String seriesName;
    @XmlAttribute(name = "dosenum")
    protected BigInteger dosenum;

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

}
