package Modelos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaItem {
	public Map <Integer, Item> menu;

	public ListaItem() {
		this.menu = new HashMap<Integer, Item >();
	}
	
	public void atualizaMenuLista() {
		Item itens = new Item();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o codigo do prato : \n");
		int cod = scanner.nextInt();
		System.out.println("Digite o nome do prato : \n");
		String nome = scanner.next();
		System.out.println("Digite o valor do prato : \n");
		int valor = scanner.nextInt();
		
		//aqui vai o itens.altera, insere é só para teste
		itens.insere(nome,valor,cod);
		
		menu.put(cod, itens);
	}
}
