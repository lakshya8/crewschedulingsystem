package com.process;

class ExceptionDetails {
	
	String errorMsg,errorCode,errorType,errorLevel,errorTime;
	Key errorDetails;
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getErrorLevel() {
		return errorLevel;
	}
	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}
	public String getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(String errorTime) {
		this.errorTime = errorTime;
	}
	public Key getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(Key errorDetails) {
		this.errorDetails = errorDetails;
	}
	
}

class ExceptionStack
{
	String stackTrace,stackMsg,stackMsgCode,processStack;

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public String getStackMsg() {
		return stackMsg;
	}

	public void setStackMsg(String stackMsg) {
		this.stackMsg = stackMsg;
	}

	public String getStackMsgCode() {
		return stackMsgCode;
	}

	public void setStackMsgCode(String stackMsgCode) {
		this.stackMsgCode = stackMsgCode;
	}

	public String getProcessStack() {
		return processStack;
	}

	public void setProcessStack(String processStack) {
		this.processStack = processStack;
	}
}

class ExceptionEvent
{
	TransactionDetails transactionDetails;
	ApplicationDetails applicationDetails;
	ExceptionDetails exceptionDetails;
	ExceptionStack exceptionStack;
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
	public ExceptionDetails getExceptionDetails() {
		return exceptionDetails;
	}
	public void setExceptionDetails(ExceptionDetails exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}
	public ExceptionStack getExceptionStack() {
		return exceptionStack;
	}
	public void setExceptionStack(ExceptionStack exceptionStack) {
		this.exceptionStack = exceptionStack;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
}