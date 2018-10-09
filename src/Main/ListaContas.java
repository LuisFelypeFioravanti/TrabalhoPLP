package Main;

import Modelos.Conta;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class ListaContas {
	public Map<Integer, Conta> contas;

	public ListaContas() {
		super();
		this.contas = new HashMap<Integer, Conta>();
	}

	public void insere(int nMesa) {
		System.out.println("Digite o numero do pedido: \n");
		Scanner scanner = new Scanner(System.in);
		int nPedido = scanner.nextInt(); // tenho umero da mesa
		Conta atual = new Conta();
		Conta existe = contas.getOrDefault(nMesa, atual);

		if (existe.mesa == -1) {// mesa vazia
			System.out.println("Foi criada uma nova conta para esta mesa. \n");
			existe.insere(nPedido);
			existe.mesa = nMesa;
			contas.put(nMesa, atual);
		} 
		else {
			Conta nova = contas.get(nMesa);
			nova.insere(nPedido);
			contas.put(nMesa, nova);
		}
	}

	public void imprime() {
		Set<Integer> mesas = contas.keySet();
		boolean vazia=true;
		for (Integer mesa : mesas) {
			if(contas.get(mesa).aberta)
				vazia=false;
		}
		
		if(!vazia) {
			for (Integer numeroMesa : mesas) {//enhaced for
				if(contas.get(numeroMesa).aberta) {
					System.out.println("Número da Mesa:" + contas.get(numeroMesa).mesa);
					contas.get(numeroMesa).imprime();
				}
			}
		}
		else
			System.out.println("Nenhum pedido feito até o momento. \n");
	}

	public void remove(int nMesa) {
		Conta atual = new Conta();

		if (contas.getOrDefault(nMesa, atual).mesa == -1) {// mesa vazia
			System.out.println("A conta desta mesa ainda não está aberta. \n");
		} 
		else {
			Conta nova = contas.get(nMesa);// ainda tem que fazer a função pra retornar o valor total
			System.out.println("Valor da Conta: " + nova.fechaConta());
			nova.destroiConta();
			
		}
	}
}
