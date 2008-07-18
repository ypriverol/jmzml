//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.19 at 10:48:08 AM BST
//


package uk.ac.ebi.jmzml.model.mzml;

import uk.ac.ebi.jmzml.model.mzml.interfaces.MzMLObject;
import uk.ac.ebi.jmzml.model.mzml.params.TargetCVParam;
import uk.ac.ebi.jmzml.model.mzml.params.TargetUserParam;
import uk.ac.ebi.jmzml.model.mzml.utilities.ParamGroupUpdater;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
         

/**
 * Target list (or 'inclusion list') configured prior to the run.
 * <p/>
 * <p>Java class for TargetListType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TargetListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}ParamGroupType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetListType", propOrder = {
        "target"
        })
public class TargetList
        implements Serializable, MzMLObject {

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected List<ParamGroup> target;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;

    /**
     * Gets the value of the target property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamGroup }
     */
    public List<ParamGroup> getTarget() {
        if (target == null) {
            target = new ArrayList<ParamGroup>();
        }
        return this.target;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    private void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        try {

            //update target list
            if (this.target != null && !this.target.isEmpty()) {
                List<ParamGroup> tmpList = new ArrayList<ParamGroup>();
                for (ParamGroup pg : this.target) {
                    ParamGroupUpdater.updateParamGroupSubclasses(pg, TargetCVParam.class, TargetUserParam.class);
                    tmpList.add(pg);
                }
                target.clear();
                target.addAll(tmpList);
            }

        } catch (InstantiationException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        }
    }

}
