package Main;

import Modelos.Conta;
import java.util.Scanner;

public class ListaContas {
	public Conta contas[];
	private int tamanho =0;
	
	

	public ListaContas(){
		super();
		this.contas = new Conta[20];
		this.tamanho = 0;
	}

	public void insere(int mesa) {
		if(contas[mesa].mesa == -1) {
			System.out.println("Digite o numero do pedido:");
			Scanner scanner = new Scanner (System.in);
			int nPedido = scanner.nextInt();
		}
		
		
		tamanho++;
	}
	
	public void imprime() {
		for(int i=0;i<tamanho;i++) {
			
			System.out.println(conta.mesa);
			System.out.println(conta.getVetor());
		}
	}

	public int getTamanho() {
		return tamanho;
	}
	
}
