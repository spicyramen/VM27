/**
 * HostInternetScsiHba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHba extends com.vmware.vim.HostHostBusAdapter
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isSoftwareBased;

	private com.vmware.vim.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities;

	private com.vmware.vim.HostInternetScsiHbaDiscoveryProperties discoveryProperties;

	private com.vmware.vim.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities;

	private com.vmware.vim.HostInternetScsiHbaAuthenticationProperties authenticationProperties;

	private com.vmware.vim.HostInternetScsiHbaIPCapabilities ipCapabilities;

	private com.vmware.vim.HostInternetScsiHbaIPProperties ipProperties;

	private java.lang.String iScsiName;

	private java.lang.String iScsiAlias;

	private com.vmware.vim.HostInternetScsiHbaSendTarget[] configuredSendTarget;

	private com.vmware.vim.HostInternetScsiHbaStaticTarget[] configuredStaticTarget;

	private java.lang.Integer maxSpeedMb;

	private java.lang.Integer currentSpeedMb;

	public HostInternetScsiHba() {
	}

	public HostInternetScsiHba(
			java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String key,
			java.lang.String device,
			int bus,
			java.lang.String status,
			java.lang.String model,
			java.lang.String driver,
			java.lang.String pci,
			boolean isSoftwareBased,
			com.vmware.vim.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities,
			com.vmware.vim.HostInternetScsiHbaDiscoveryProperties discoveryProperties,
			com.vmware.vim.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities,
			com.vmware.vim.HostInternetScsiHbaAuthenticationProperties authenticationProperties,
			com.vmware.vim.HostInternetScsiHbaIPCapabilities ipCapabilities,
			com.vmware.vim.HostInternetScsiHbaIPProperties ipProperties,
			java.lang.String iScsiName,
			java.lang.String iScsiAlias,
			com.vmware.vim.HostInternetScsiHbaSendTarget[] configuredSendTarget,
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] configuredStaticTarget,
			java.lang.Integer maxSpeedMb, java.lang.Integer currentSpeedMb) {
		super(dynamicType, dynamicProperty, key, device, bus, status, model,
				driver, pci);
		this.isSoftwareBased = isSoftwareBased;
		this.discoveryCapabilities = discoveryCapabilities;
		this.discoveryProperties = discoveryProperties;
		this.authenticationCapabilities = authenticationCapabilities;
		this.authenticationProperties = authenticationProperties;
		this.ipCapabilities = ipCapabilities;
		this.ipProperties = ipProperties;
		this.iScsiName = iScsiName;
		this.iScsiAlias = iScsiAlias;
		this.configuredSendTarget = configuredSendTarget;
		this.configuredStaticTarget = configuredStaticTarget;
		this.maxSpeedMb = maxSpeedMb;
		this.currentSpeedMb = currentSpeedMb;
	}

	/**
	 * Gets the isSoftwareBased value for this HostInternetScsiHba.
	 * 
	 * @return isSoftwareBased
	 */
	public boolean isIsSoftwareBased() {
		return isSoftwareBased;
	}

	/**
	 * Sets the isSoftwareBased value for this HostInternetScsiHba.
	 * 
	 * @param isSoftwareBased
	 */
	public void setIsSoftwareBased(boolean isSoftwareBased) {
		this.isSoftwareBased = isSoftwareBased;
	}

	/**
	 * Gets the discoveryCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return discoveryCapabilities
	 */
	public com.vmware.vim.HostInternetScsiHbaDiscoveryCapabilities getDiscoveryCapabilities() {
		return discoveryCapabilities;
	}

	/**
	 * Sets the discoveryCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param discoveryCapabilities
	 */
	public void setDiscoveryCapabilities(
			com.vmware.vim.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities) {
		this.discoveryCapabilities = discoveryCapabilities;
	}

	/**
	 * Gets the discoveryProperties value for this HostInternetScsiHba.
	 * 
	 * @return discoveryProperties
	 */
	public com.vmware.vim.HostInternetScsiHbaDiscoveryProperties getDiscoveryProperties() {
		return discoveryProperties;
	}

	/**
	 * Sets the discoveryProperties value for this HostInternetScsiHba.
	 * 
	 * @param discoveryProperties
	 */
	public void setDiscoveryProperties(
			com.vmware.vim.HostInternetScsiHbaDiscoveryProperties discoveryProperties) {
		this.discoveryProperties = discoveryProperties;
	}

	/**
	 * Gets the authenticationCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return authenticationCapabilities
	 */
	public com.vmware.vim.HostInternetScsiHbaAuthenticationCapabilities getAuthenticationCapabilities() {
		return authenticationCapabilities;
	}

	/**
	 * Sets the authenticationCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param authenticationCapabilities
	 */
	public void setAuthenticationCapabilities(
			com.vmware.vim.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities) {
		this.authenticationCapabilities = authenticationCapabilities;
	}

	/**
	 * Gets the authenticationProperties value for this HostInternetScsiHba.
	 * 
	 * @return authenticationProperties
	 */
	public com.vmware.vim.HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
		return authenticationProperties;
	}

	/**
	 * Sets the authenticationProperties value for this HostInternetScsiHba.
	 * 
	 * @param authenticationProperties
	 */
	public void setAuthenticationProperties(
			com.vmware.vim.HostInternetScsiHbaAuthenticationProperties authenticationProperties) {
		this.authenticationProperties = authenticationProperties;
	}

	/**
	 * Gets the ipCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return ipCapabilities
	 */
	public com.vmware.vim.HostInternetScsiHbaIPCapabilities getIpCapabilities() {
		return ipCapabilities;
	}

	/**
	 * Sets the ipCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param ipCapabilities
	 */
	public void setIpCapabilities(
			com.vmware.vim.HostInternetScsiHbaIPCapabilities ipCapabilities) {
		this.ipCapabilities = ipCapabilities;
	}

	/**
	 * Gets the ipProperties value for this HostInternetScsiHba.
	 * 
	 * @return ipProperties
	 */
	public com.vmware.vim.HostInternetScsiHbaIPProperties getIpProperties() {
		return ipProperties;
	}

	/**
	 * Sets the ipProperties value for this HostInternetScsiHba.
	 * 
	 * @param ipProperties
	 */
	public void setIpProperties(
			com.vmware.vim.HostInternetScsiHbaIPProperties ipProperties) {
		this.ipProperties = ipProperties;
	}

	/**
	 * Gets the iScsiName value for this HostInternetScsiHba.
	 * 
	 * @return iScsiName
	 */
	public java.lang.String getIScsiName() {
		return iScsiName;
	}

	/**
	 * Sets the iScsiName value for this HostInternetScsiHba.
	 * 
	 * @param iScsiName
	 */
	public void setIScsiName(java.lang.String iScsiName) {
		this.iScsiName = iScsiName;
	}

	/**
	 * Gets the iScsiAlias value for this HostInternetScsiHba.
	 * 
	 * @return iScsiAlias
	 */
	public java.lang.String getIScsiAlias() {
		return iScsiAlias;
	}

	/**
	 * Sets the iScsiAlias value for this HostInternetScsiHba.
	 * 
	 * @param iScsiAlias
	 */
	public void setIScsiAlias(java.lang.String iScsiAlias) {
		this.iScsiAlias = iScsiAlias;
	}

	/**
	 * Gets the configuredSendTarget value for this HostInternetScsiHba.
	 * 
	 * @return configuredSendTarget
	 */
	public com.vmware.vim.HostInternetScsiHbaSendTarget[] getConfiguredSendTarget() {
		return configuredSendTarget;
	}

	/**
	 * Sets the configuredSendTarget value for this HostInternetScsiHba.
	 * 
	 * @param configuredSendTarget
	 */
	public void setConfiguredSendTarget(
			com.vmware.vim.HostInternetScsiHbaSendTarget[] configuredSendTarget) {
		this.configuredSendTarget = configuredSendTarget;
	}

	public com.vmware.vim.HostInternetScsiHbaSendTarget getConfiguredSendTarget(
			int i) {
		return this.configuredSendTarget[i];
	}

	public void setConfiguredSendTarget(int i,
			com.vmware.vim.HostInternetScsiHbaSendTarget _value) {
		this.configuredSendTarget[i] = _value;
	}

	/**
	 * Gets the configuredStaticTarget value for this HostInternetScsiHba.
	 * 
	 * @return configuredStaticTarget
	 */
	public com.vmware.vim.HostInternetScsiHbaStaticTarget[] getConfiguredStaticTarget() {
		return configuredStaticTarget;
	}

	/**
	 * Sets the configuredStaticTarget value for this HostInternetScsiHba.
	 * 
	 * @param configuredStaticTarget
	 */
	public void setConfiguredStaticTarget(
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] configuredStaticTarget) {
		this.configuredStaticTarget = configuredStaticTarget;
	}

	public com.vmware.vim.HostInternetScsiHbaStaticTarget getConfiguredStaticTarget(
			int i) {
		return this.configuredStaticTarget[i];
	}

	public void setConfiguredStaticTarget(int i,
			com.vmware.vim.HostInternetScsiHbaStaticTarget _value) {
		this.configuredStaticTarget[i] = _value;
	}

	/**
	 * Gets the maxSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @return maxSpeedMb
	 */
	public java.lang.Integer getMaxSpeedMb() {
		return maxSpeedMb;
	}

	/**
	 * Sets the maxSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @param maxSpeedMb
	 */
	public void setMaxSpeedMb(java.lang.Integer maxSpeedMb) {
		this.maxSpeedMb = maxSpeedMb;
	}

	/**
	 * Gets the currentSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @return currentSpeedMb
	 */
	public java.lang.Integer getCurrentSpeedMb() {
		return currentSpeedMb;
	}

	/**
	 * Sets the currentSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @param currentSpeedMb
	 */
	public void setCurrentSpeedMb(java.lang.Integer currentSpeedMb) {
		this.currentSpeedMb = currentSpeedMb;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostInternetScsiHba)) {
			return false;
		}
		HostInternetScsiHba other = (HostInternetScsiHba) obj;
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
				&& this.isSoftwareBased == other.isIsSoftwareBased()
				&& ((this.discoveryCapabilities == null && other
						.getDiscoveryCapabilities() == null) || (this.discoveryCapabilities != null && this.discoveryCapabilities
						.equals(other.getDiscoveryCapabilities())))
				&& ((this.discoveryProperties == null && other
						.getDiscoveryProperties() == null) || (this.discoveryProperties != null && this.discoveryProperties
						.equals(other.getDiscoveryProperties())))
				&& ((this.authenticationCapabilities == null && other
						.getAuthenticationCapabilities() == null) || (this.authenticationCapabilities != null && this.authenticationCapabilities
						.equals(other.getAuthenticationCapabilities())))
				&& ((this.authenticationProperties == null && other
						.getAuthenticationProperties() == null) || (this.authenticationProperties != null && this.authenticationProperties
						.equals(other.getAuthenticationProperties())))
				&& ((this.ipCapabilities == null && other.getIpCapabilities() == null) || (this.ipCapabilities != null && this.ipCapabilities
						.equals(other.getIpCapabilities())))
				&& ((this.ipProperties == null && other.getIpProperties() == null) || (this.ipProperties != null && this.ipProperties
						.equals(other.getIpProperties())))
				&& ((this.iScsiName == null && other.getIScsiName() == null) || (this.iScsiName != null && this.iScsiName
						.equals(other.getIScsiName())))
				&& ((this.iScsiAlias == null && other.getIScsiAlias() == null) || (this.iScsiAlias != null && this.iScsiAlias
						.equals(other.getIScsiAlias())))
				&& ((this.configuredSendTarget == null && other
						.getConfiguredSendTarget() == null) || (this.configuredSendTarget != null && java.util.Arrays
						.equals(this.configuredSendTarget, other
								.getConfiguredSendTarget())))
				&& ((this.configuredStaticTarget == null && other
						.getConfiguredStaticTarget() == null) || (this.configuredStaticTarget != null && java.util.Arrays
						.equals(this.configuredStaticTarget, other
								.getConfiguredStaticTarget())))
				&& ((this.maxSpeedMb == null && other.getMaxSpeedMb() == null) || (this.maxSpeedMb != null && this.maxSpeedMb
						.equals(other.getMaxSpeedMb())))
				&& ((this.currentSpeedMb == null && other.getCurrentSpeedMb() == null) || (this.currentSpeedMb != null && this.currentSpeedMb
						.equals(other.getCurrentSpeedMb())));
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
		_hashCode += (isIsSoftwareBased() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getDiscoveryCapabilities() != null) {
			_hashCode += getDiscoveryCapabilities().hashCode();
		}
		if (getDiscoveryProperties() != null) {
			_hashCode += getDiscoveryProperties().hashCode();
		}
		if (getAuthenticationCapabilities() != null) {
			_hashCode += getAuthenticationCapabilities().hashCode();
		}
		if (getAuthenticationProperties() != null) {
			_hashCode += getAuthenticationProperties().hashCode();
		}
		if (getIpCapabilities() != null) {
			_hashCode += getIpCapabilities().hashCode();
		}
		if (getIpProperties() != null) {
			_hashCode += getIpProperties().hashCode();
		}
		if (getIScsiName() != null) {
			_hashCode += getIScsiName().hashCode();
		}
		if (getIScsiAlias() != null) {
			_hashCode += getIScsiAlias().hashCode();
		}
		if (getConfiguredSendTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfiguredSendTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfiguredSendTarget(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConfiguredStaticTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfiguredStaticTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfiguredStaticTarget(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMaxSpeedMb() != null) {
			_hashCode += getMaxSpeedMb().hashCode();
		}
		if (getCurrentSpeedMb() != null) {
			_hashCode += getCurrentSpeedMb().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostInternetScsiHba.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHba"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isSoftwareBased");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"isSoftwareBased"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("discoveryCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"discoveryCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaDiscoveryCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("discoveryProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"discoveryProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaDiscoveryProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authenticationCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"authenticationCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaAuthenticationCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authenticationProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"authenticationProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaAuthenticationProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaIPCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaIPProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"iScsiName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiAlias");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"iScsiAlias"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configuredSendTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"configuredSendTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaSendTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configuredStaticTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"configuredStaticTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaStaticTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxSpeedMb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxSpeedMb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentSpeedMb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"currentSpeedMb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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

}
