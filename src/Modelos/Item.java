package Modelos;

import java.util.ArrayList;

public class Item {
	private String nome;
	private int preco;
	private int codigo;
	private TipoPrato tipo;

	
	
	public void insere(String nome,int preco,int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		
	}
	
	public void altera(String novoNome, int novoPreco, int novoCodigo) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.codigo = novoCodigo;
	}

	public int getPreco() {
		return preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
