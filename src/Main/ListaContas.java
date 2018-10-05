package Main;

import Modelos.Conta;
import java.util.ArrayList;

public class ListaContas {
	public ArrayList<Conta> contas;
	private int tamanho =0;
	

	public void insere(int mesa) {
		System.out.println("entrei");
		Conta pedido = new Conta(mesa);
		pedido.insere();
		tamanho++;
		
	}
	
	public void imprime() {
		for(int i=0;i>tamanho;i++)
			System.out.println(contas.get(i));
	}

	public int getTamanho() {
		return tamanho;
	}
	
}
