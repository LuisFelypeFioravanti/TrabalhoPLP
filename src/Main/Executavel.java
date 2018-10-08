package Main;

import java.util.Scanner;

public class Executavel {

	public static void insere(ListaContas listaConta) {
		System.out.println("Digite o numero da mesa :");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		// carrega e mostra Lista de Pratos
		listaConta.insere(i);

	}

	public static void imprime(ListaContas listaConta) {
		System.out.println("Imprime");
		listaConta.imprime();
	}

	public static void main(String[] args) {
		ListaContas listaConta = new ListaContas();
		// aqui tem que carregar o HashMap de Contas do Arquivo pra essa ListaConta
		int loop = 0;
		Scanner scanner = new Scanner(System.in);
		while (loop != 9) {
			System.out.println("Bem Vindo ao Restaurante do Hudson!");
			System.out.println("Digite a opcao desejada:");
			System.out.println("1- Inserir um novo pedido");
			System.out.println("2- Listar as contas atuais:");
			System.out.println("3- Fechar um conta existente");
			System.out.println("4- Atualizar Menu");
			System.out.println("9- Encerrar Programa");
			

			int op = scanner.nextInt();
			
			switch(op) {
				case(1):
					System.out.println("Digite a quantidade de pedidos que deseja fazer:");
					int qtdPedidos = scanner.nextInt();
					for (int i = 0; i < qtdPedidos; i++) {
						insere(listaConta);
					}
					break;
				case(2):
					imprime(listaConta);
					break;
				case(3):
					//fechaConta(listaConta);
					break;
				case(4):
					//atualizaMenu(listaConta);
					break;
			}
		}
		//aqui tem que gravar a lista no arquivo, pq o programa vai fechar.
		System.out.println("Volte Sempre!");
	}

}