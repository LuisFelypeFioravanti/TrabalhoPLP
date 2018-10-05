package Main;

import java.util.Scanner;

public class Executavel {
	public static ListaContas listaContas1;
	
	public static void insere() {
		System.out.println("Digite o numero da mesa :");
		Scanner scanner = new Scanner (System.in);
		int i = scanner.nextInt();
		//carrega e mostra Lista de Pratos
		listaContas1.insere(i);
		
	}
	public static void imprime() {
		listaContas1.imprime();
	}
	public static void main(String[] args) {
		System.out.println("Digite a opcao desejada:");
		System.out.println("1-Insere:");
		Scanner scanner = new Scanner (System.in);
		int i = scanner.nextInt();
		if(i == 1) {
			for(int j=0;j<5;j++) {
				insere();
			}
			imprime();
		}
	}

}