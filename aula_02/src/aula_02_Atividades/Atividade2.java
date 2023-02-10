package aula_02_Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0)
			if (numero > 0)
				System.out.println("O número é par e positivo!");
			else
				System.out.println("O número é par e negativo!");
		else if (numero > 0)
			System.out.println("O número é impar e positivo!");
		else
			System.out.println("O número é impar e negativo!");

		leia.close();
	}

}
