/**
 * NotEnoughLogicalCpus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class NotEnoughLogicalCpus extends com.vmware.vim25.NotEnoughCpus
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ManagedObjectReference host;

	public NotEnoughLogicalCpus() {
	}

	public NotEnoughLogicalCpus(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage, int numCpuDest,
			int numCpuVm, com.vmware.vim25.ManagedObjectReference host) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				numCpuDest, numCpuVm);
		this.host = host;
	}

	/**
	 * Gets the host value for this NotEnoughLogicalCpus.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this NotEnoughLogicalCpus.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NotEnoughLogicalCpus)) {
			return false;
		}
		NotEnoughLogicalCpus other = (NotEnoughLogicalCpus) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NotEnoughLogicalCpus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NotEnoughLogicalCpus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
