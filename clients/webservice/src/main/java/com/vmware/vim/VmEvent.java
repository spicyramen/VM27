/**
 * VmEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmEvent extends com.vmware.vim.Event implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean template;

	public VmEvent() {
	}

	public VmEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, boolean template) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage);
		this.template = template;
	}

	/**
	 * Gets the template value for this VmEvent.
	 * 
	 * @return template
	 */
	public boolean isTemplate() {
		return template;
	}

	/**
	 * Sets the template value for this VmEvent.
	 * 
	 * @param template
	 */
	public void setTemplate(boolean template) {
		this.template = template;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmEvent)) {
			return false;
		}
		VmEvent other = (VmEvent) obj;
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
		_equals = super.equals(obj) && this.template == other.isTemplate();
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
		_hashCode += (isTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmEvent.class, true);

	static {
		typeDesc
				.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("template");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"template"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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

}
