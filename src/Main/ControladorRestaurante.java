package Main;

import Modelos.Conta;
import Modelos.Item;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.*;

import java.util.Map;
import java.awt.Menu;
import java.util.ArrayList;

public class ControladorRestaurante {
	public static Map<Integer, Conta> contas;
	public static Map<Integer, Item> menu;
	public ControladorRestaurante() {
		ControladorRestaurante.contas = new HashMap<Integer, Conta>();
		ControladorRestaurante.menu = new HashMap<Integer, Item>();
	}

	public static void insere(int nMesa, int nPedido) {
		Conta atual = new Conta();
		Conta existe = contas.getOrDefault(nMesa, atual);
		existe.insere(nPedido, menu);

		if (existe.aberta) {
			if (existe.mesa == -1) {// mesa vazia
				System.out.println("Foi criada uma nova conta para esta mesa. \n");
				existe.mesa = nMesa;
			}
			contas.put(nMesa, existe);
			System.out.println("\n Pedido realizado com Sucesso");
		} else {
			System.out.println("O Item do pedido não existe no nosso Menu! \n");
		}
	}

	public void imprime() {
		Set<Integer> mesas = contas.keySet();
		boolean vazia = true;

		for (Integer mesa : mesas) {
			if (contas.get(mesa).aberta)
				vazia = false;
		}

		if (!vazia) {
			for (Integer numeroMesa : mesas) {// enhaced for
				if (contas.get(numeroMesa).aberta) {
					System.out.println("Número da Mesa:" + contas.get(numeroMesa).mesa);
					System.out.println("Valor Total: R$" + contas.get(numeroMesa).imprimeValorTotal());
					ArrayList<Item> temp = contas.get(numeroMesa).getVetor();//lista temporaria
					System.out.println("Itens Consumidos:");
					for (Item item : temp) {
						System.out.println("-" + item.getNome() + "\n");
					}
				}
			}
		} else
			System.out.println("Nenhum pedido feito até o momento. \n");
	}

	public void remove(int nMesa) {
		Conta atual = new Conta();

		if (contas.getOrDefault(nMesa, atual).mesa == -1) {// mesa vazia
			System.out.println("A conta desta mesa ainda não está aberta. \n");
		} else {
			Conta nova = contas.get(nMesa);// ainda tem que fazer a função pra retornar o valor total
			System.out.println("Valor da Conta: " + nova.fechaConta());
			nova.destroiConta();

		}
	}

	public void atualizaMenuLista(int cod,String nome, int valor) {
		Item itens = new Item();
		itens.insere(nome, valor, cod);// aqui vai o itens.altera, insere é só para teste
		menu.put(cod, itens);
	}
	
	public void finaliza() {
		geraXML(menu);
	}
	
	public void geraXML(Map<Integer, Item> menu) {
		XStream gerador = new XStream(new DomDriver());
		String xml = gerador.toXML(menu);
		System.out.println(xml);
		geraArquivo(xml);
		
		
	}
	
	public void geraArquivo(String xml) {
		PrintWriter print = null;
		try {
			File arqMenu = new File("/home/aluno/workspace/menu.xml");
			print = new PrintWriter(arqMenu);
			
			print.write(xml);
			print.flush();
			print.close();
		}
		catch(FileNotFoundException ex) {
			Logger.getLogger(ControladorRestaurante.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally {
			print.close();
		}
	}

}
