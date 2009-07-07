/**
 * AlarmReconfiguredEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AlarmReconfiguredEvent  extends com.vmware.vim.AlarmEvent  implements java.io.Serializable {
    private com.vmware.vim.ManagedEntityEventArgument entity;

    public AlarmReconfiguredEvent() {
    }

    public AlarmReconfiguredEvent(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim.DatacenterEventArgument datacenter,
           com.vmware.vim.ComputeResourceEventArgument computeResource,
           com.vmware.vim.HostEventArgument host,
           com.vmware.vim.VmEventArgument vm,
           java.lang.String fullFormattedMessage,
           com.vmware.vim.AlarmEventArgument alarm,
           com.vmware.vim.ManagedEntityEventArgument entity) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            fullFormattedMessage,
            alarm);
        this.entity = entity;
    }


    /**
     * Gets the entity value for this AlarmReconfiguredEvent.
     * 
     * @return entity
     */
    public com.vmware.vim.ManagedEntityEventArgument getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this AlarmReconfiguredEvent.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim.ManagedEntityEventArgument entity) {
        this.entity = entity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmReconfiguredEvent)) return false;
        AlarmReconfiguredEvent other = (AlarmReconfiguredEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmReconfiguredEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "AlarmReconfiguredEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedEntityEventArgument"));
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