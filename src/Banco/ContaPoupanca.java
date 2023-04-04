package Banco;

public class ContaPoupanca extends Banco {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String numConta, String numTitular) {
		super();
		setNumConta(numConta);
		setNomTitular(numTitular);
	}

	void resgatar(double valor, ContaCorrente destino) {
		if (this.getSaldo() >= valor) {
			this.saldo = getSaldo() - valor;
			destino.depositar(valor);
		} else {
			System.out.println("SALDO INSUFICIENTE!!\n" + "SALDO DISPONIVEL: " + getSaldo());
		}

	}

	public void depositar(double valor) {
		this.saldo = this.getSaldo() - valor;

	}

	void mostrarDados() {

		System.out.println("+-------------------------------+");
		System.out.println("| DADOS DA CONTA ");
		System.out.println("| Titular Conta Poupança: " + getNomTitular());
		System.out.println("| Numero da Conta: " + getNumConta());
		System.out.println("| Saldo atual: " + getSaldo());
		System.out.println("+-------------------------------+");
	}

	void mostrarSaldo() {

		System.out.println("SEU SALDO DA CONTA POUPANÇA É: " + getSaldo());
	}

}