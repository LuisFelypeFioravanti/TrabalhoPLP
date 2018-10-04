package Modelos;

public class Item {
	private String nome;
	private int preco;
	private int codigo;
	private int qtdItens; 
	
	
	
	private void insere(String nome,int preco,int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		
		qtdItens++;
		
	}
	
	public int calQtdItens() {
		return qtdItens;
	}
	
	private void altera(String novoNome, int novoPreco, int novoCodigo) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.codigo = novoCodigo;
	}
	
	//public int getValorPrato(int codPrato) {
		//for(int i = 0; i < qtdItens; i++) {
			
		//}
	//}
}
