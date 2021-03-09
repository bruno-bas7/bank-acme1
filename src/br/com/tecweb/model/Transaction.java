package br.com.tecweb.model;

public class Transaction {

	private Account account;
	private Double value;
	private String typeTransaction;
	private String dataTimeTransaction;
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	public String getDataTimeTransaction() {
		return dataTimeTransaction;
	}
	public void setDataTimeTransaction(String dataTimeTransaction) {
		this.dataTimeTransaction = dataTimeTransaction;
	}
	
	@Override
	public String toString() {
		return "value=" + value + "\n typeTransaction=" + typeTransaction + "\n dataTimeTransaction="
				+ dataTimeTransaction +"";
	}
	
	
	
}
