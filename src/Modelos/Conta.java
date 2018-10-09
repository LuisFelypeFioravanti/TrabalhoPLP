package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private int valorTotal;
	public int mesa;
	private ArrayList<Integer> vetor;
	private int tamanho;
	public boolean aberta;

	public Conta(){
		this.mesa= -1;	
		this.valorTotal = 0;
		vetor = new ArrayList<>();
		this.tamanho=0;
		aberta=false;
	}
	
	public void insere(int nPedido) {
		aberta=true;
		vetor.add(nPedido);
		tamanho++;
	}
	
	public int fechaConta() {
		int tam =vetor.size();
		valorTotal=0;
		for (int i = 0; i < tam; i++) {
			valorTotal+= vetor.get(i);
		}
		return valorTotal;		
	}
	
	public void destroiConta() {
		this.mesa= -1;	
		this.valorTotal = 0;
		vetor.clear();
		this.tamanho=0;
		aberta=false;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void imprime() {
		if(aberta) {
			valorTotal=fechaConta();
			System.out.println("Valor Total:"+ " " + valorTotal+"\n" + "Código dos Pedidos:"+vetor +"\n");
		}
	}
	

	public ArrayList<Integer> getVetor() {
		return vetor;
	}


}
