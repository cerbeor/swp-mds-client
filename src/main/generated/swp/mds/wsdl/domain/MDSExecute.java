
package swp.mds.wsdl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://swpartners.com}mds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mds"
})
@XmlRootElement(name = "MDSExecute")
public class MDSExecute {

    @XmlElement(required = true)
    protected Mds mds;

    /**
     * Gets the value of the mds property.
     * 
     * @return
     *     possible object is
     *     {@link Mds }
     *     
     */
    public Mds getMds() {
        return mds;
    }

    /**
     * Sets the value of the mds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mds }
     *     
     */
    public void setMds(Mds value) {
        this.mds = value;
    }

}
