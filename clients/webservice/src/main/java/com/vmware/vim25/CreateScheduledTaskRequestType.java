/**
 * CreateScheduledTaskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CreateScheduledTaskRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private com.vmware.vim25.ManagedObjectReference entity;

    private com.vmware.vim25.ScheduledTaskSpec spec;

    public CreateScheduledTaskRequestType() {
    }

    public CreateScheduledTaskRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           com.vmware.vim25.ManagedObjectReference entity,
           com.vmware.vim25.ScheduledTaskSpec spec) {
           this._this = _this;
           this.entity = entity;
           this.spec = spec;
    }


    /**
     * Gets the _this value for this CreateScheduledTaskRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this CreateScheduledTaskRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the entity value for this CreateScheduledTaskRequestType.
     * 
     * @return entity
     */
    public com.vmware.vim25.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this CreateScheduledTaskRequestType.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the spec value for this CreateScheduledTaskRequestType.
     * 
     * @return spec
     */
    public com.vmware.vim25.ScheduledTaskSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this CreateScheduledTaskRequestType.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.ScheduledTaskSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateScheduledTaskRequestType)) return false;
        CreateScheduledTaskRequestType other = (CreateScheduledTaskRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateScheduledTaskRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CreateScheduledTaskRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}