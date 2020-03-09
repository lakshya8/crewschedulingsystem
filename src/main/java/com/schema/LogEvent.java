package com.schema;

class LogDetails {

	String message,msgCode,processName,stepName,msgTime;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getMsgTime() {
		return msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}
	public int getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(int logLevel) {
		this.logLevel = logLevel;
	}
	int logLevel;
	
}

class LogEvent
{
	TransactionDetails transactionDetails;
	ApplicationDetails applicationDetails;
	LogDetails logDetails;
	Payload payload;
	public TransactionDetails getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	public ApplicationDetails getApplicationDetails() {
		return applicationDetails;
	}
	public void setApplicationDetails(ApplicationDetails applicationDetails) {
		this.applicationDetails = applicationDetails;
	}
	public LogDetails getLogDetails() {
		return logDetails;
	}
	public void setLogDetails(LogDetails logDetails) {
		this.logDetails = logDetails;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
}