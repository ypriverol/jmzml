//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.22 at 06:16:33 PM GMT 
//


package uk.ac.ebi.jmzml.model.mzml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.ac.ebi.jmzml.model.mzml.interfaces.MzMLObject;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.ReferenceableParamGroupAdapter;


/**
 * A reference to a previously defined ParamGroup, which is a reusable container of one or more cvParams.
 * 
 * <p>Java class for ReferenceableParamGroupRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceableParamGroupRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceableParamGroupRefType")
public class ReferenceableParamGroupRef
    implements Serializable, MzMLObject
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(ReferenceableParamGroupAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected ReferenceableParamGroup referenceableParamGroup;

    /**
     * Gets the value of the referenceableParamGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ReferenceableParamGroup getReferenceableParamGroup() {
        return referenceableParamGroup;
    }

    /**
     * Sets the value of the referenceableParamGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceableParamGroup(ReferenceableParamGroup value) {
        this.referenceableParamGroup = value;
    }

}
