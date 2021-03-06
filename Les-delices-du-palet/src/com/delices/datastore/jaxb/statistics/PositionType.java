//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 07:47:18 PM CET 
//


package com.delices.datastore.jaxb.statistics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="positionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="LW"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="F-D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "positionType")
@XmlEnum
public enum PositionType {

    NA("NA"),
    C("C"),
    LW("LW"),
    RW("RW"),
    D("D"),
    G("G"),
    F("F"),
    @XmlEnumValue("F-D")
    F_D("F-D");
    private final String value;

    PositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionType fromValue(String v) {
        for (PositionType c: PositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
