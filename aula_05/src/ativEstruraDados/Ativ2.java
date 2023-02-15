package ativEstruraDados;

import java.util.Scanner;
import java.util.Stack;

public class Ativ2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int opcao, set = 0;
		String nome;

		do {
			System.out.println("*********************************************************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("*********************************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				System.out.println("\nListar todos os Livros: \n");

				if (pilha.isEmpty())
					System.out.println("Sem livros!");
				else if (set <= 0 || set >= 0) {
					pilha.forEach(System.out::println);
					System.out.println("\nDigite qualquer número para Sair do Menu de Lista");
					set = leia.nextInt();
				}
				break;
			case 3:

				if (pilha.isEmpty())
					System.out.println("A Fila está vazia! \n");
				else {
					pilha.pop();
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
			default:
				if (opcao > 3)
					System.out.println("Opção Inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}

}
