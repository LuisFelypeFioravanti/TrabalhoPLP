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

		if (contas.getOrDefault(nMesa, atual).mesa == -1) {// mesa vazia
			System.out.println("Foi criada uma nova conta para esta mesa. \n");
			atual.insere(nPedido);
			atual.mesa = nMesa;
			contas.put(nMesa, atual);
		} else {
			Conta nova = contas.get(nMesa);
			nova.insere(nPedido);
			contas.put(nMesa, nova);
		}
	}

	public void imprime() {
		Set<Integer> mesas = contas.keySet();
		boolean vazia = mesas.isEmpty();
		if(!vazia) {
			for (Integer mesa : mesas) {//enhaced for
				System.out.println("Número da Mesa:" + contas.get(mesa).mesa);
				contas.get(mesa).imprime();
			}
		}
		else
			System.out.println("Nenhum pedido feito até o momento. \n");
	}
}
