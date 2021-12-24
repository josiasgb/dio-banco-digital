
public class Main {

	public static void main(String[] args) {
		
		Cliente josias = new Cliente();
		josias.setNome("Josias");
		
		
		Conta cc = new ContaCorrente(josias);
		Conta poupanca = new ContaPoupanca(josias);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
