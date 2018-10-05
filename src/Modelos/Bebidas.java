package Modelos;

public class Bebidas implements Menu {
	
	
	public int qtdItens;
	private String tipoBebida;
	
	
	Item drink = new Item();
	@Override
	public int getQtdItens() {
		
		return qtdItens;
	}

}
