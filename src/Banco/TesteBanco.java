package Banco;

import java.util.Scanner; 
public class TesteBanco {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			Scanner inputString = new Scanner(System.in); 
				double depInicial = 0;
				double valor;
				String nome, numero;
				int opcao;



				ContaCorrente cc = new ContaCorrente();
				ContaPoupanca cp = new ContaPoupanca();



				cc.getSaldo();

				do {

					System.out.println("!!!!!!!!!Banco Fuctura!!!!!!!!!\n ");
					System.out.println("(=============MENU=============)\n ");
					System.out.println("Escolha uma das opcões a seguir:\n");
					System.out.println(" 1 - Criar Conta");
					System.out.println(" 2 - Dados da Conta ");
					System.out.println(" 3 - Depositar valor ");
					System.out.println(" 4 - Sacar valor ");
					System.out.println(" 5 - Aplicar ");
					System.out.println(" 6 - Resgatar ");
					System.out.println(" 7 - Mostrar Saldo");
					System.out.println(" 0 - Sair \n");
					System.out.println("BEM VINDO AO BANCO FUCTURA!!!");



					opcao = input.nextInt();

					switch(opcao) {

					case 1:
						System.out.println("DIGITE O NOME DO TITULAR DA CONTA: ");
						nome = inputString.next();
						System.out.println("DIGITE O NUMERO DA CONTA: ");
						numero = inputString.next();
						if (depInicial<= 0) {
							System.out.println("SALDO DISPONIVEL " + depInicial);
							System.out.println("DESEJA FAZER UM DEPOSITO: "
									+ "\n1 - SIM" + "\n2 - NAO ");
							int resposta = input.nextInt();

							if (resposta == 1) {
								System.out.println("DIGITE O VALOR DO DEPOSITO: ");
								depInicial = input.nextInt();
								cc = new ContaCorrente(nome, numero, depInicial);
								cp = new ContaPoupanca(nome, numero);

							}else {
								cc = new ContaCorrente(nome, numero);
								cp = new ContaPoupanca(nome, numero);

							}

						}else {System.out.println("Seu saldo é: " + depInicial +" não precisa de deposito inicial.");

						}
						break;
					case 2:
						cc.mostrarDados();
						cp.mostrarDados();		
						break;

					case 3:
						System.out.println("DIGITE O VALOR: ");
						valor = input.nextDouble();
						cc.depositar(valor);
						break;

					case 4:
						cc.mostrarDados();
						cp.mostrarDados();
						System.out.println("DIGITE O VALOR: ");
						valor = input.nextDouble();
						cc.sacar(valor);
						break;

					case 5:
						System.out.println("DIGITE O VALOR A SER APLICADO: \n"
								+ "SEU SALDO ATUAL É: " + cc.getSaldo());
						valor = input.nextDouble();
						cc.aplicar(valor, cp);
						break;

					case 6:
						System.out.println("DIGITE O VALOR A SER RESGATADO: ");
						valor = input.nextDouble();
						cp.resgatar(valor, cc);
						break;


					case 7:
						cc.mostrarSaldo();
						cp.mostrarSaldo();
						break;
					}

				}while(opcao != 0);
			
		
		System.out.println("OBRIGADO E VOLTE SEMPRE!!");








	}
}
