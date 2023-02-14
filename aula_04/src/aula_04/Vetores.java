package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = { 1, 2, 3, 4, 5 };

		float[] vetorFloat = new float[5];
		// System.out.println(vetorInteiros); mostra a memória

		for (int i = 0; i < vetorInteiros.length; i++)
			System.out.println("posição " + i + " = " + vetorInteiros[i]);

		for (int i1 = 0; i1 < vetorFloat.length; i1++) {
			System.out.println("Digite uma valor para a posica [" + i1 + "]");
			vetorFloat[i1] = leia.nextFloat();
		}

		Arrays.sort(vetorFloat); // ordem crescente

		for (var numero : vetorFloat) // "var" ou "float" para escolher o tipo
			System.out.println(numero);

		// Arrays.sort(vetorFloat, Collections.reverseOrder);

		// for(var numero : vetorFloat)
		// System.out.println(numero);

		leia.close();
	}

}
