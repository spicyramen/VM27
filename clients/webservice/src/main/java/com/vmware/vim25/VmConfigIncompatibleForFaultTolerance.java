/**
 * VmConfigIncompatibleForFaultTolerance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmConfigIncompatibleForFaultTolerance extends
		com.vmware.vim25.VmConfigFault implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.LocalizedMethodFault fault;

	public VmConfigIncompatibleForFaultTolerance() {
	}

	public VmConfigIncompatibleForFaultTolerance(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			com.vmware.vim25.LocalizedMethodFault fault) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.fault = fault;
	}

	/**
	 * Gets the fault value for this VmConfigIncompatibleForFaultTolerance.
	 * 
	 * @return fault
	 */
	public com.vmware.vim25.LocalizedMethodFault getFault() {
		return fault;
	}

	/**
	 * Sets the fault value for this VmConfigIncompatibleForFaultTolerance.
	 * 
	 * @param fault
	 */
	public void setFault(com.vmware.vim25.LocalizedMethodFault fault) {
		this.fault = fault;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmConfigIncompatibleForFaultTolerance)) {
			return false;
		}
		VmConfigIncompatibleForFaultTolerance other = (VmConfigIncompatibleForFaultTolerance) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.fault == null && other.getFault() == null) || (this.fault != null && this.fault
						.equals(other.getFault())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getFault() != null) {
			_hashCode += getFault().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmConfigIncompatibleForFaultTolerance.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmConfigIncompatibleForFaultTolerance"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fault");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
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
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
