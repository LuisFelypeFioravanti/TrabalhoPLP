package Modelos;

import java.util.ArrayList;

public class Item {
	private static final TipoPrato Nada = null;
	private String nome;
	private int preco;
	private int codigo;
	private TipoPrato tipo;

	
	
	public Item() {
		super();
		this.nome = "";
		this.preco = 0;
		this.codigo = -1;
		this.tipo = Nada;
	}

	public void insere(String nome,int preco,int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		
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
