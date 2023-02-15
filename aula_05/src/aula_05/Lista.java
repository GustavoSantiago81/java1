package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		// double numero = 0 não funciona
		Double numero = 0.0; // Ctrl + em cima de qualquer classe

		ArrayList<Double> notas = new ArrayList<Double>();

		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		double nota = 0;
		 

		do {

			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar todas as notas");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Remover uma nota");
			System.out.println("5 - Atualizar nota");
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as notas: \n");

				/*
				 * for (var listaNota : notas) System.out.println(listaNota);
				 * System.out.println("\n");
				 */

				if (notas.isEmpty())
					System.out.println("Base de Dados vazia!");
				else
					notas.forEach(System.out::println);

				break;
			case 3:
				System.out.println("Procurar uma nota: ");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("O índice da nota é: " + notas.indexOf(nota));
				break;
			case 4:
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				// notas.remove(nota); // Nota
				notas.remove(notas.indexOf(nota)); // Indice da nota
				break;
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);
				break;
			default:
				if (opcao > 6)
					System.out.println("Opção Inválida!");
			}

		} while (opcao != 6);

		/*
		 * notas.add(9.0);
		 * notas.add(8.0); 
		 * notas.add(7.0);
		 */
		leia.close();
	}

}
