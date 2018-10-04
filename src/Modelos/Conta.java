package Modelos;

public class Conta {
	private int valorTotal;
	public int mesa;
	private Pedidos meuPedido;
	private Item meuPrato;

	public Conta(int mesa) {
		this.mesa=mesa;
		meuPedido = new Pedidos(mesa);
		meuPrato = new Item();
		
	}
	
	public void inserePedido(int qtdCodPratos,int codPrato) {
		meuPedido.setPrato(codPrato,qtdCodPratos);
	}
	
	//public void insere

	public int calcConta () {
		int qtdPratos,codPratos,valor;
		
		codPratos = meuPedido.getCodPrato();
		qtdPratos = meuPedido.getQtdPrato();
		
		//valor = meuPrato.getValorPrato(codPratos);
		
		//valorTotal = valor * qtdPratos;
		
		return 0;
	}

}
