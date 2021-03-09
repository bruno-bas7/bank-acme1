package br.com.tecweb.model;

public class AccountCurrent extends Account {
	@Override
	public Double sacar(Double value) {
		super.setBalance(super.getBalance() -10);
		return super.sacar(value);
		
	}
	
	@Override
	public Double transferir(Account account, Double value) {
		super.setBalance(super.getBalance() -10);
		return super.transferir(account, value);
	}

}

