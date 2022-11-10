package javarodeio;

public class Principal {

	public static void main(String[] args) {
	
	Cliente cliente1 = new Cliente("Vitor Hugo" , 203);
	cliente1.conta = new Contas();
	cliente1.conta.numero = 26;
	
	Contas conta1 = new Contas();
	conta1.numero = 204;
	
	
	
	Contas conta2 = new Contas();
	conta2.numero = 202;
	
	Cliente cliente2 = new Cliente("XALACA", 293);
	cliente2.conta = conta2;
	
	cliente1.conta.setDeposita(2503.4);
	cliente1.conta.setSaque(523);


	System.out.println(cliente1.conta.getSaldo());

	
	cliente2.conta.setDeposita(2200);
	cliente2.conta.setSaque(200);
	
	System.out.println(cliente2.conta.getSaldo());
	
	Cliente  clienteA = new Cliente ("Vitor", 111);
	clienteA.conta = new Contas();
	clienteA.conta.numero = 34930;
	
	Funcionarios func = new Funcionarios("vitao");

	}

}
