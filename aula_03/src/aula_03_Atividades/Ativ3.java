package aula_03_Atividades;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, pessoas1 = 0, pessoas2 = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade < 21)
				pessoas1++;
			if (idade > 50)
				pessoas2++;
		}
		System.out.println("Total de pessoas menores de 21 anos: " + (pessoas1 - 1));
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoas2);

		leia.close();
	}

}
