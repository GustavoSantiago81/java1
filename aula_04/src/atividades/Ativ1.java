package atividades;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, indicador = 0;

		System.out.println("Digite o número que você deseja encontrar:");
		numero = leia.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
				System.out.println("O número " + numero + " está localizado na posição: " + i);
				indicador = 1;
			}
		}

		if (indicador == 0)
			System.out.println("O número " + numero + " não foi encontrado!");

		leia.close();
	}

}
