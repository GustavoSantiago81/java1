package ativEstruraDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao, set = 0;
		String nome;

		do {
			System.out.println("*********************************************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*********************************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("\nListar todos os nomes: \n");

				if (fila.isEmpty())
					System.out.println("A Fila está vazia!");
				else if (set <= 0 || set >= 0) {
					fila.forEach(System.out::println);
					System.out.println("\nDigite qualquer número para Sair do Menu de Lista");
					set = leia.nextInt();
				}
				break;
			case 3:

				if (fila.isEmpty())
					System.out.println("A Fila está vazia! \n");
				else {
					fila.poll();
					System.out.println("O Cliente foi Chamado!");
				}
				break;
			default:
				if (opcao > 3)
					System.out.println("Opção Inválida!");
			}

		} while (opcao != 0);

	}

}
