/**
 * ArrayOfHostInternetScsiHbaStaticTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostInternetScsiHbaStaticTarget implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostInternetScsiHbaStaticTarget[] hostInternetScsiHbaStaticTarget;

	public ArrayOfHostInternetScsiHbaStaticTarget() {
	}

	public ArrayOfHostInternetScsiHbaStaticTarget(
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] hostInternetScsiHbaStaticTarget) {
		this.hostInternetScsiHbaStaticTarget = hostInternetScsiHbaStaticTarget;
	}

	/**
	 * Gets the hostInternetScsiHbaStaticTarget value for this
	 * ArrayOfHostInternetScsiHbaStaticTarget.
	 * 
	 * @return hostInternetScsiHbaStaticTarget
	 */
	public com.vmware.vim25.HostInternetScsiHbaStaticTarget[] getHostInternetScsiHbaStaticTarget() {
		return hostInternetScsiHbaStaticTarget;
	}

	/**
	 * Sets the hostInternetScsiHbaStaticTarget value for this
	 * ArrayOfHostInternetScsiHbaStaticTarget.
	 * 
	 * @param hostInternetScsiHbaStaticTarget
	 */
	public void setHostInternetScsiHbaStaticTarget(
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] hostInternetScsiHbaStaticTarget) {
		this.hostInternetScsiHbaStaticTarget = hostInternetScsiHbaStaticTarget;
	}

	public com.vmware.vim25.HostInternetScsiHbaStaticTarget getHostInternetScsiHbaStaticTarget(
			int i) {
		return this.hostInternetScsiHbaStaticTarget[i];
	}

	public void setHostInternetScsiHbaStaticTarget(int i,
			com.vmware.vim25.HostInternetScsiHbaStaticTarget _value) {
		this.hostInternetScsiHbaStaticTarget[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostInternetScsiHbaStaticTarget)) {
			return false;
		}
		ArrayOfHostInternetScsiHbaStaticTarget other = (ArrayOfHostInternetScsiHbaStaticTarget) obj;
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
		_equals = true && ((this.hostInternetScsiHbaStaticTarget == null && other
				.getHostInternetScsiHbaStaticTarget() == null) || (this.hostInternetScsiHbaStaticTarget != null && java.util.Arrays
				.equals(this.hostInternetScsiHbaStaticTarget, other
						.getHostInternetScsiHbaStaticTarget())));
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
		int _hashCode = 1;
		if (getHostInternetScsiHbaStaticTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostInternetScsiHbaStaticTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostInternetScsiHbaStaticTarget(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ArrayOfHostInternetScsiHbaStaticTarget.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostInternetScsiHbaStaticTarget"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostInternetScsiHbaStaticTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaStaticTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaStaticTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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

}
