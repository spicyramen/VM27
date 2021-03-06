/**
 * VirtualMachineGuestSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineGuestSummary extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String guestId;

	private java.lang.String guestFullName;

	private com.vmware.vim.VirtualMachineToolsStatus toolsStatus;

	private java.lang.String hostName;

	private java.lang.String ipAddress;

	public VirtualMachineGuestSummary() {
	}

	public VirtualMachineGuestSummary(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String guestId, java.lang.String guestFullName,
			com.vmware.vim.VirtualMachineToolsStatus toolsStatus,
			java.lang.String hostName, java.lang.String ipAddress) {
		super(dynamicType, dynamicProperty);
		this.guestId = guestId;
		this.guestFullName = guestFullName;
		this.toolsStatus = toolsStatus;
		this.hostName = hostName;
		this.ipAddress = ipAddress;
	}

	/**
	 * Gets the guestId value for this VirtualMachineGuestSummary.
	 * 
	 * @return guestId
	 */
	public java.lang.String getGuestId() {
		return guestId;
	}

	/**
	 * Sets the guestId value for this VirtualMachineGuestSummary.
	 * 
	 * @param guestId
	 */
	public void setGuestId(java.lang.String guestId) {
		this.guestId = guestId;
	}

	/**
	 * Gets the guestFullName value for this VirtualMachineGuestSummary.
	 * 
	 * @return guestFullName
	 */
	public java.lang.String getGuestFullName() {
		return guestFullName;
	}

	/**
	 * Sets the guestFullName value for this VirtualMachineGuestSummary.
	 * 
	 * @param guestFullName
	 */
	public void setGuestFullName(java.lang.String guestFullName) {
		this.guestFullName = guestFullName;
	}

	/**
	 * Gets the toolsStatus value for this VirtualMachineGuestSummary.
	 * 
	 * @return toolsStatus
	 */
	public com.vmware.vim.VirtualMachineToolsStatus getToolsStatus() {
		return toolsStatus;
	}

	/**
	 * Sets the toolsStatus value for this VirtualMachineGuestSummary.
	 * 
	 * @param toolsStatus
	 */
	public void setToolsStatus(
			com.vmware.vim.VirtualMachineToolsStatus toolsStatus) {
		this.toolsStatus = toolsStatus;
	}

	/**
	 * Gets the hostName value for this VirtualMachineGuestSummary.
	 * 
	 * @return hostName
	 */
	public java.lang.String getHostName() {
		return hostName;
	}

	/**
	 * Sets the hostName value for this VirtualMachineGuestSummary.
	 * 
	 * @param hostName
	 */
	public void setHostName(java.lang.String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Gets the ipAddress value for this VirtualMachineGuestSummary.
	 * 
	 * @return ipAddress
	 */
	public java.lang.String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the ipAddress value for this VirtualMachineGuestSummary.
	 * 
	 * @param ipAddress
	 */
	public void setIpAddress(java.lang.String ipAddress) {
		this.ipAddress = ipAddress;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineGuestSummary)) {
			return false;
		}
		VirtualMachineGuestSummary other = (VirtualMachineGuestSummary) obj;
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
				&& ((this.guestId == null && other.getGuestId() == null) || (this.guestId != null && this.guestId
						.equals(other.getGuestId())))
				&& ((this.guestFullName == null && other.getGuestFullName() == null) || (this.guestFullName != null && this.guestFullName
						.equals(other.getGuestFullName())))
				&& ((this.toolsStatus == null && other.getToolsStatus() == null) || (this.toolsStatus != null && this.toolsStatus
						.equals(other.getToolsStatus())))
				&& ((this.hostName == null && other.getHostName() == null) || (this.hostName != null && this.hostName
						.equals(other.getHostName())))
				&& ((this.ipAddress == null && other.getIpAddress() == null) || (this.ipAddress != null && this.ipAddress
						.equals(other.getIpAddress())));
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
		if (getGuestId() != null) {
			_hashCode += getGuestId().hashCode();
		}
		if (getGuestFullName() != null) {
			_hashCode += getGuestFullName().hashCode();
		}
		if (getToolsStatus() != null) {
			_hashCode += getToolsStatus().hashCode();
		}
		if (getHostName() != null) {
			_hashCode += getHostName().hashCode();
		}
		if (getIpAddress() != null) {
			_hashCode += getIpAddress().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineGuestSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineGuestSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestFullName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestFullName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toolsStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"toolsStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineToolsStatus"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hostName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
