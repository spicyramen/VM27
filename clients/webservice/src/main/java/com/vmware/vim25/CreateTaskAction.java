/**
 * CreateTaskAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CreateTaskAction extends com.vmware.vim25.Action implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String taskTypeId;

	private boolean cancelable;

	public CreateTaskAction() {
	}

	public CreateTaskAction(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String taskTypeId, boolean cancelable) {
		super(dynamicType, dynamicProperty);
		this.taskTypeId = taskTypeId;
		this.cancelable = cancelable;
	}

	/**
	 * Gets the taskTypeId value for this CreateTaskAction.
	 * 
	 * @return taskTypeId
	 */
	public java.lang.String getTaskTypeId() {
		return taskTypeId;
	}

	/**
	 * Sets the taskTypeId value for this CreateTaskAction.
	 * 
	 * @param taskTypeId
	 */
	public void setTaskTypeId(java.lang.String taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	/**
	 * Gets the cancelable value for this CreateTaskAction.
	 * 
	 * @return cancelable
	 */
	public boolean isCancelable() {
		return cancelable;
	}

	/**
	 * Sets the cancelable value for this CreateTaskAction.
	 * 
	 * @param cancelable
	 */
	public void setCancelable(boolean cancelable) {
		this.cancelable = cancelable;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CreateTaskAction)) {
			return false;
		}
		CreateTaskAction other = (CreateTaskAction) obj;
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
				&& ((this.taskTypeId == null && other.getTaskTypeId() == null) || (this.taskTypeId != null && this.taskTypeId
						.equals(other.getTaskTypeId())))
				&& this.cancelable == other.isCancelable();
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
		if (getTaskTypeId() != null) {
			_hashCode += getTaskTypeId().hashCode();
		}
		_hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CreateTaskAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CreateTaskAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskTypeId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"taskTypeId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cancelable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cancelable"));
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
