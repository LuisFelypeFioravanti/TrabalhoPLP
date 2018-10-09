package Main;

import java.util.Scanner;

public class Executavel {
	
	private static ControladorRestaurante controlador;

	public static void insere() {
		System.out.println("Digite o numero da mesa : \n");
		Scanner scanner = new Scanner(System.in);
		int nMesa = scanner.nextInt();
		System.out.println("Digite o numero do pedido: \n");
		int nPedido = scanner.nextInt(); // tenho numero da mesa
		
		// carrega e mostra Lista de Pratos
		controlador.insere(nMesa,nPedido);
		System.out.println("\n Pedido realizado com Sucesso");

	}

	public static void imprime(ListaContas listaConta) {
		listaConta.imprime();
	}
	
	public static void fechaConta(ListaContas listaConta) {
		System.out.println("Digite o numero da mesa que deseja fechar a conta: \n");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		// carrega e mostra Lista de Pratos
		listaConta.remove(i);
		System.out.println("\n Conta encerrada com Sucesso \n");
	}
	
	public static void atualizaMenu( ListaItem  cardapio) {
		cardapio.atualizaMenuLista();
	}

	public static void main(String[] args) {
		controlador = new ControladorRestaurante();
		//tem que criar um HashMap pros itens também, e baixar o arquivo nessa lista
		// aqui tem que carregar o HashMap de Contas do Arquivo pra essa ListaConta
		int op = 0;
		Scanner scanner = new Scanner(System.in);
		while (op != 9) {
			System.out.println("\n Bem Vindo ao Restaurante do Hudson!");
			System.out.println("Digite a opcao desejada:");
			System.out.println("1- Inserir um novo pedido");
			System.out.println("2- Listar as contas atuais:");
			System.out.println("3- Fechar um conta existente");
			System.out.println("4- Atualizar Menu");
			System.out.println("9- Encerrar Programa \n");
			

			op = scanner.nextInt();

			switch(op) {
				case(1):
					System.out.println("Digite a quantidade de pedidos que deseja fazer: \n");
					int qtdPedidos = scanner.nextInt();
					for (int i = 0; i < qtdPedidos; i++) {
						insere();
					}
					break;
				case(2):
					imprime(listaConta);
					break;
				case(3):
					fechaConta(listaConta);
					break;
				case(4):
					atualizaMenu(cardapio);
					break;
			}
		}
		//aqui tem que gravar a lista no arquivo, pq o programa vai fechar.
		System.out.println("Volte Sempre! \n");
	}

}