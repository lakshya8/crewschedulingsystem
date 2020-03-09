package com.process;

class Id
{
	int exception_id,log_id;

	public int getException_id() {
		return exception_id;
	}

	public void setException_id(int exception_id) {
		this.exception_id = exception_id;
	}

	public int getLog_id() {
		return log_id;
	}

	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
}
class Payload {
	String pay;
	Id id;
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
}
