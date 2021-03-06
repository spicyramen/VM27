/**
 * UpdateLicenseLabelRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateLicenseLabelRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String licenseKey;

	private java.lang.String labelKey;

	private java.lang.String labelValue;

	public UpdateLicenseLabelRequestType() {
	}

	public UpdateLicenseLabelRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, java.lang.String labelKey,
			java.lang.String labelValue) {
		this._this = _this;
		this.licenseKey = licenseKey;
		this.labelKey = labelKey;
		this.labelValue = labelValue;
	}

	/**
	 * Gets the _this value for this UpdateLicenseLabelRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdateLicenseLabelRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the licenseKey value for this UpdateLicenseLabelRequestType.
	 * 
	 * @return licenseKey
	 */
	public java.lang.String getLicenseKey() {
		return licenseKey;
	}

	/**
	 * Sets the licenseKey value for this UpdateLicenseLabelRequestType.
	 * 
	 * @param licenseKey
	 */
	public void setLicenseKey(java.lang.String licenseKey) {
		this.licenseKey = licenseKey;
	}

	/**
	 * Gets the labelKey value for this UpdateLicenseLabelRequestType.
	 * 
	 * @return labelKey
	 */
	public java.lang.String getLabelKey() {
		return labelKey;
	}

	/**
	 * Sets the labelKey value for this UpdateLicenseLabelRequestType.
	 * 
	 * @param labelKey
	 */
	public void setLabelKey(java.lang.String labelKey) {
		this.labelKey = labelKey;
	}

	/**
	 * Gets the labelValue value for this UpdateLicenseLabelRequestType.
	 * 
	 * @return labelValue
	 */
	public java.lang.String getLabelValue() {
		return labelValue;
	}

	/**
	 * Sets the labelValue value for this UpdateLicenseLabelRequestType.
	 * 
	 * @param labelValue
	 */
	public void setLabelValue(java.lang.String labelValue) {
		this.labelValue = labelValue;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateLicenseLabelRequestType)) {
			return false;
		}
		UpdateLicenseLabelRequestType other = (UpdateLicenseLabelRequestType) obj;
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
				&& ((this.licenseKey == null && other.getLicenseKey() == null) || (this.licenseKey != null && this.licenseKey
						.equals(other.getLicenseKey())))
				&& ((this.labelKey == null && other.getLabelKey() == null) || (this.labelKey != null && this.labelKey
						.equals(other.getLabelKey())))
				&& ((this.labelValue == null && other.getLabelValue() == null) || (this.labelValue != null && this.labelValue
						.equals(other.getLabelValue())));
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
		if (getLicenseKey() != null) {
			_hashCode += getLicenseKey().hashCode();
		}
		if (getLabelKey() != null) {
			_hashCode += getLabelKey().hashCode();
		}
		if (getLabelValue() != null) {
			_hashCode += getLabelValue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdateLicenseLabelRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateLicenseLabelRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("labelKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"labelKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("labelValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"labelValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
