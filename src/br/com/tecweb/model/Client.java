package br.com.tecweb.model;

public class Client {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	private Account conta;
	
	public Client() {
		
	}
	
	public Client(Long id, String name, String email, String phone, Account conta) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.conta = conta;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Account getConta() {
		return conta;
	}
	public void setConta(Account conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Client {id=" + id + "\n name=" + name + "\n email=" + email + "\n phone=" + phone + "\n " + conta
				+ "}";
	}
	
	

}
