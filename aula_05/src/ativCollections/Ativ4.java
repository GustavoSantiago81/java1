package ativCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ativ4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		int numero = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		if (numeros.contains(numero))
			System.out.println("O número " + numero + " foi encontrado!");
		else
			System.out.println("O número " + numero + " não foi encontrado!");

		leia.close();

	}

}
