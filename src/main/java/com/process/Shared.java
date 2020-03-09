package com.process;

class BusinessRefrenceId {

	String name,value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class Key
{
	String name,value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

class TransactionDetails
{
	String gtId,messageId;
	BusinessRefrenceId businessRefrenceId;
	Key key;
	public String getGtId() {
		return gtId;
	}
	public void setGtId(String gtId) {
		this.gtId = gtId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public BusinessRefrenceId getBusinessRefrenceId() {
		return businessRefrenceId;
	}
	public void setBusinessRefrenceId(BusinessRefrenceId businessRefrenceId) {
		this.businessRefrenceId = businessRefrenceId;
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	@Override
	public String toString() {
		StringBuffer retBuf = new StringBuffer();
		//retBuf.append("This message is generated from toString() method. ");
		retBuf.append(this.getGtId());
		retBuf.append(" : ");
		retBuf.append(this.getMessageId());
		retBuf.append(" : ");
		retBuf.append(this.getKey().getName());
		retBuf.append(" : ");
		retBuf.append(this.getKey().getValue());
		retBuf.append(" : ");
		retBuf.append(this.getBusinessRefrenceId().getName());
		retBuf.append(" : ");
		retBuf.append(this.getBusinessRefrenceId().getValue());
		return retBuf.toString();
	}
}

class ApplicationDetails
{
	String applicationVersion,applicationName,instanceId,serviceName,serviceVersion,operationName;

	public String getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	@Override
	public String toString() {
		StringBuffer retBuf = new StringBuffer();
		retBuf.append("This message is generated from toString() method. ");
		retBuf.append(this.getApplicationName());
		retBuf.append(" : ");
		retBuf.append(this.getApplicationVersion());
		retBuf.append(" : ");
		retBuf.append(this.getInstanceId());
		retBuf.append(" : ");
		retBuf.append(this.getOperationName());
		retBuf.append(" : ");
		retBuf.append(this.getServiceName());
		retBuf.append(" : ");
		retBuf.append(this.getServiceVersion());
		return retBuf.toString();
	}
}