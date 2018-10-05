package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private int valorTotal;
	public int mesa;
	private Item meuPrato;
	private ArrayList<Integer> vetor;

	public Conta(int mesa) {
		this.mesa=mesa;	
		
		//meuPrato = new Item();
	}
	
	public void insere() {
		System.out.println("Digite o Codigo do prato desejado :");
		Scanner scanner = new Scanner (System.in);
		int i = scanner.nextInt();
		vetor.add(i);
	}
	
//	public void inserePedido(int qtdCodPratos,int codPrato) {
//		.setPrato(codPrato,qtdCodPratos);
//	}
	
	//public void insere

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
