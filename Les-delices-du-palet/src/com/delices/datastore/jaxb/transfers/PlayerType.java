//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 07:47:38 PM CET 
//


package com.delices.datastore.jaxb.transfers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for playerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transfer" type="{http://feed.elasticstats.com/schema/hockey/transfers-v2.0.xsd}transferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://feed.elasticstats.com/schema/hockey/transfers-v2.0.xsd}basePlayerAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playerType", propOrder = {
    "transfer"
})
public class PlayerType {

    protected List<TransferType> transfer;
    @XmlAttribute(name = "abbr_name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String abbrName;
    @XmlAttribute(name = "jersey_number")
    protected String jerseyNumber;
    @XmlAttribute(name = "position")
    protected PositionType position;
    @XmlAttribute(name = "primary_position")
    protected PositionType primaryPosition;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "handedness")
    protected String handedness;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "first_name")
    protected String firstName;
    @XmlAttribute(name = "last_name")
    protected String lastName;
    @XmlAttribute(name = "full_name")
    protected String fullName;

    /**
     * Gets the value of the transfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferType }
     * 
     * 
     */
    public List<TransferType> getTransfer() {
        if (transfer == null) {
            transfer = new ArrayList<TransferType>();
        }
        return this.transfer;
    }

    /**
     * Gets the value of the abbrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrName() {
        return abbrName;
    }

    /**
     * Sets the value of the abbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrName(String value) {
        this.abbrName = value;
    }

    /**
     * Gets the value of the jerseyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * Sets the value of the jerseyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJerseyNumber(String value) {
        this.jerseyNumber = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the primaryPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPrimaryPosition() {
        return primaryPosition;
    }

    /**
     * Sets the value of the primaryPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPrimaryPosition(PositionType value) {
        this.primaryPosition = value;
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
     * Gets the value of the handedness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandedness() {
        return handedness;
    }

    /**
     * Sets the value of the handedness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandedness(String value) {
        this.handedness = value;
    }

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

}
