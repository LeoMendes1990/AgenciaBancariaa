package Banco;

public class ContaCorrente extends Banco {

	

	public ContaCorrente() {

	}

	public ContaCorrente(String numConta, String nomTitular) {

		this.setNumConta(numConta);
		this.setNomTitular(nomTitular);
	}

	public ContaCorrente(String numConta, String nomTitular, double saldo) {

		setNumConta(numConta);
		setNomTitular(nomTitular);
		setSaldo(saldo);
	}

	void depositar(double valor) {
		this.saldo = this.getSaldo() + valor;

	}

	void sacar(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente! ");

		} else {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!!\n" + "SEU SALDO ATUAL É: " + getSaldo());
		}
	}

	void aplicar(double valor, ContaPoupanca destino) {
		if (getSaldo() >= valor) {
			this.saldo = getSaldo() - valor;
			destino.depositar(valor);
		} else {
			System.out.println("saldo insuficiente:/n " + "Saldo atual: " + getSaldo());
		}
	}

	void mostrarDados() {
		System.out.println("+-------------------------------+");
		System.out.println("| DADOS DA CONTA ");
		System.out.println("| Titular Conta Corrente: " + getNomTitular());
		System.out.println("| Numero da Conta: " + getNumConta());
		System.out.println("| Saldo atual: " + getSaldo());
		System.out.println("+-------------------------------+");
	}

	void mostrarSaldo() {
		System.out.println("SEU SALDO DA CONTA CORRENTE É: " + getSaldo());
	}

}
