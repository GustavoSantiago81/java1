package atividades;

import java.util.Scanner;

public class Ativ2V2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10], i;
		float soma = 0, media = 0;

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite uma valor para a posica [" + i + "]");
			vetor[i] = leia.nextInt();
		}

		System.out.println("Elementos nos índices ímpares :");
		for (i = 1; i < vetor.length; i += 2) {
			System.out.println(vetor[i]);
		}

		System.out.println("Elementos pares :");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0)
				System.out.println(vetor[i]);

			soma += vetor[i];
		}

		media = soma / 10;

		System.out.println("Soma: " + soma);
		System.out.println("media: " + media);

		leia.close();
	}

}
