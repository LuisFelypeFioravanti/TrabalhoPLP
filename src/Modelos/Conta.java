package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private int valorTotal;
	public int mesa;
	private ArrayList<Integer> vetor;
	private int tamanho;

	public void Conta() {
		this.mesa= -1;	
		this.valorTotal = 0;
		vetor= new ArrayList();
		this.tamanho=0;
	}
	
	public void insere() {
		
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
//	public void inserePedido(int qtdCodPratos,int codPrato) {
//		.setPrato(codPrato,qtdCodPratos);
//	}
	
	//public void insere

	public ArrayList<Integer> getVetor() {
		return vetor;
	}

	public int calcConta () {
		int qtdPratos,codPratos,valor;
//		
//		codPratos = meuPedido.getCodPrato();
//		qtdPratos = meuPedido.getQtdPrato();
		
		//valor = meuPrato.getValorPrato(codPratos);
		
		//valorTotal = valor * qtdPratos;
		
		return 0;
	}

}
