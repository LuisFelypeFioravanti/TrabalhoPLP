package Modelos;

public class Pedidos {
	private int numMesa;
	private int codPrato;
	private int qtdPrato;
	
	public Pedidos (int numMesa) {
		this.numMesa = numMesa;		
	}
	
	
	public void setPrato(int codPrato, int qtdCodPrato) {
		this.codPrato = codPrato;
		this.qtdPrato = qtdCodPrato;
	}
	
	
	public int getNumMesa() {
		return numMesa;
	}
	public int getCodPrato () {
		return codPrato;
	}
	
	public int getQtdPrato() {
		return qtdPrato;
	}
	
}
