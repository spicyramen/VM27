/**
 * UpdateChildResourceConfigurationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateChildResourceConfigurationRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ResourceConfigSpec[] spec;

	public UpdateChildResourceConfigurationRequestType() {
	}

	public UpdateChildResourceConfigurationRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ResourceConfigSpec[] spec) {
		this._this = _this;
		this.spec = spec;
	}

	/**
	 * Gets the _this value for this
	 * UpdateChildResourceConfigurationRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this
	 * UpdateChildResourceConfigurationRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the spec value for this UpdateChildResourceConfigurationRequestType.
	 * 
	 * @return spec
	 */
	public com.vmware.vim25.ResourceConfigSpec[] getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this UpdateChildResourceConfigurationRequestType.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim25.ResourceConfigSpec[] spec) {
		this.spec = spec;
	}

	public com.vmware.vim25.ResourceConfigSpec getSpec(int i) {
		return this.spec[i];
	}

	public void setSpec(int i, com.vmware.vim25.ResourceConfigSpec _value) {
		this.spec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateChildResourceConfigurationRequestType)) {
			return false;
		}
		UpdateChildResourceConfigurationRequestType other = (UpdateChildResourceConfigurationRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && java.util.Arrays
						.equals(this.spec, other.getSpec())));
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
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getSpec(), i);
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
			UpdateChildResourceConfigurationRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateChildResourceConfigurationRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourceConfigSpec"));
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
