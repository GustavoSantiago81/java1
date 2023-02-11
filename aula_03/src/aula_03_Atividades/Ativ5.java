package aula_03_Atividades;

import java.util.Scanner;

public class Ativ5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;
		boolean ok = false;
		String continua = "S";

		while (continua.equals("S")) {
			do {
				System.out.println("Digite um número: ");
				numero = leia.nextInt();
				if (numero != 0) {
					if (numero > 0)
						soma += numero;
				} else
					ok = true;
			} while (ok == false);

			System.out.println("A soma dos números positivos é: " + soma);
			System.out.println("Desejar continuar (S/N): ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			soma = 0;
			ok = false;
		}
		leia.close();
	}

}
