package com.spring.VO;

public class TransactionVO {
	private String transactionId;
	private String transactionType;
	private String health;
	private String status;
	private String criticality;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCriticality() {
		return criticality;
	}
	public void setCriticality(String criticality) {
		this.criticality = criticality;
	}
}
