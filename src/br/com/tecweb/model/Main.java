package br.com.tecweb.model;

public class Main {

	public static void main(String[] args) {

		Account acsLuiz = new AccountSave();
		acsLuiz.setId(1l);
		acsLuiz.setNumber("000-0");
		acsLuiz.setAgency("3030");
		acsLuiz.setBalance(1000.00);
		
		Client client1 = new Client(1l,"Luiz Luiz","luiz.info@out.com","999999999", acsLuiz);

		Account accAntonio = new AccountCurrent();
		accAntonio.setId(2l);
		accAntonio.setNumber("000-00");
		accAntonio.setAgency("4040");
		accAntonio.setBalance(2000.00);

		Client client2 = new Client(2l,"Antonio Antonio", "antonio.info@out.com", "77777777", accAntonio);
	
		AccountSave acsArtur = new AccountSave();
		acsArtur.setId(3l);
		acsArtur.setNumber("111-1");
		acsArtur.setAgency("3131");
		acsArtur.setBalance(3000.00);
		
		Client client3 = new Client(3l, "Artur Artur", "artur.info@out.com", "88888888", acsArtur);
		
		AccountCurrent accJoao = new AccountCurrent();
		accJoao.setId(4l);
		accJoao.setNumber("111-11");
		accJoao.setAgency("4141");
		accJoao.setBalance(4000.00);
//		
		Client client4 = new Client(4l, "Joao Joao", "joao.info@out.com" , "66666666", accJoao);
//		
		
		acsLuiz.transferir(acsArtur,100.00);	
		System.out.println(client1);
		
		System.out.println("**********************************************************************");

		accJoao.sacar(100.00);  //conta corrente, tem uma taxa de 10 de juros por saque ou transferencia;
		System.out.println(client4);

		System.out.println("**********************************************************************");
		
		accAntonio.depositar(500.00);
		System.out.println(client2);
		
		System.out.println("**********************************************************************");
		
		acsArtur.transferir(acsLuiz, 500.00);
		System.out.println(client3);
		
		System.out.println("**********************************************************************");
	}

}
