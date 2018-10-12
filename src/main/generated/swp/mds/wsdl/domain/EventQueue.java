
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
 *       &lt;sequence maxOccurs="2"&gt;
 *         &lt;element ref="{http://swpartners.com}event_queue_detail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="careplan_id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="careplan_date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventQueueDetail"
})
@XmlRootElement(name = "event_queue")
public class EventQueue {

    @XmlElement(name = "event_queue_detail")
    protected List<EventQueueDetail> eventQueueDetail;
    @XmlAttribute(name = "careplan_id")
    protected BigInteger careplanId;
    @XmlAttribute(name = "careplan_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar careplanDate;

    /**
     * Gets the value of the eventQueueDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventQueueDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventQueueDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventQueueDetail }
     * 
     * 
     */
    public List<EventQueueDetail> getEventQueueDetail() {
        if (eventQueueDetail == null) {
            eventQueueDetail = new ArrayList<EventQueueDetail>();
        }
        return this.eventQueueDetail;
    }

    /**
     * Gets the value of the careplanId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareplanId() {
        return careplanId;
    }

    /**
     * Sets the value of the careplanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareplanId(BigInteger value) {
        this.careplanId = value;
    }

    /**
     * Gets the value of the careplanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCareplanDate() {
        return careplanDate;
    }

    /**
     * Sets the value of the careplanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCareplanDate(XMLGregorianCalendar value) {
        this.careplanDate = value;
    }

}
