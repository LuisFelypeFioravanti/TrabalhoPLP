package Main;

import Modelos.Conta;
import Modelos.Item;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

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
					contas.get(numeroMesa).imprime();
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

	public void atualizaMenuLista() {
		Item itens = new Item();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o codigo do prato : \n");
		int cod = scanner.nextInt();
		System.out.println("Digite o nome do prato : \n");
		String nome = scanner.next();
		System.out.println("Digite o valor do prato : \n");
		int valor = scanner.nextInt();

		// aqui vai o itens.altera, insere é só para teste
		itens.insere(nome, valor, cod);

		menu.put(cod, itens);
	}

}
