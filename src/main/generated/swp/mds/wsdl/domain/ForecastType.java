
package swp.mds.wsdl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://swpartners.com}baseForecastType"&gt;
 *       &lt;attribute name="antigen_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="series_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forecastType")
public class ForecastType
    extends BaseForecastType
{

    @XmlAttribute(name = "antigen_name", required = true)
    protected String antigenName;
    @XmlAttribute(name = "series_name", required = true)
    protected String seriesName;

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

}
