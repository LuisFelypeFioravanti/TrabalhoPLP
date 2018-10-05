package Main;

import java.util.Scanner;

public class Executavel {
	
	public static void insere(ListaContas listaConta) {
		System.out.println("Digite o numero da mesa :");
		Scanner scanner = new Scanner (System.in);
		int i = scanner.nextInt();
		//carrega e mostra Lista de Pratos
		listaConta.insere(i);
		
	}
	public static void imprime(ListaContas listaConta) {
		System.out.println("Imprime");
		listaConta.imprime();
	}
	public static void main(String[] args) {
		ListaContas listaConta = new ListaContas();
		System.out.println("Digite a opcao desejada:");
		System.out.println("1-Insere:");
		Scanner scanner = new Scanner (System.in);
		int i = scanner.nextInt();
		if(i == 1) {
			for(int j=0;j<5;j++) {
				insere(listaConta);
			}
			imprime(listaConta);
		}
	}

}