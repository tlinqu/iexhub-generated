/*******************************************************************************
 * Copyright (c) 2015, 2016 Substance Abuse and Mental Health Services Administration (SAMHSA)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Eversolve, LLC - initial IExHub implementation for Health Information Exchange (HIE) integration
 *     Anthony Sute, Ioana Singureanu
 *******************************************************************************/

package PDQSupplier.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MFMI_MT700711UV01.Author2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MFMI_MT700711UV01.Author2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="noteText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="time" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="modeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="assignedEntity" type="{urn:hl7-org:v3}COCT_MT090003UV01.AssignedEntity"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationType" fixed="AUT" />
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" default="AP" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFMI_MT700711UV01.Author2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "noteText",
    "time",
    "modeCode",
    "assignedEntity"
})
public class MFMIMT700711UV01Author2 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected ED noteText;
    protected IVLTS time;
    protected CE modeCode;
    @XmlElement(required = true, nillable = true)
    protected COCTMT090003UV01AssignedEntity assignedEntity;
    @XmlAttribute
    protected List<String> nullFlavor;
    @XmlAttribute(required = true)
    protected List<String> typeCode;
    @XmlAttribute
    protected String contextControlCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setNoteText(ED value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setTime(IVLTS value) {
        this.time = value;
    }

    /**
     * Gets the value of the modeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getModeCode() {
        return modeCode;
    }

    /**
     * Sets the value of the modeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setModeCode(CE value) {
        this.modeCode = value;
    }

    /**
     * Gets the value of the assignedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT090003UV01AssignedEntity }
     *     
     */
    public COCTMT090003UV01AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * Sets the value of the assignedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT090003UV01AssignedEntity }
     *     
     */
    public void setAssignedEntity(COCTMT090003UV01AssignedEntity value) {
        this.assignedEntity = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the contextControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextControlCode() {
        if (contextControlCode == null) {
            return "AP";
        } else {
            return contextControlCode;
        }
    }

    /**
     * Sets the value of the contextControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextControlCode(String value) {
        this.contextControlCode = value;
    }

}