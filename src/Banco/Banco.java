package Banco;

public abstract class Banco {

	private String numConta; 
	private String nomTitular;
	protected double saldo;

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void depositar(double valor) {

	}

	void sacar() {

	}

	void mostrarSaldo() {

	}

}
