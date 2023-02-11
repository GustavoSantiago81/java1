package aula_03_Atividades;

import java.util.Scanner;

public class Ativ6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float numero, soma = 0, media = 0, quantidade = 0;
		boolean ok = false;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextFloat();
			if (numero != 0) {
				if (numero > 0 && numero % 3 == 0) {
					soma += numero;
					quantidade ++;
					
					media = soma / quantidade;
				}
				
			} else
				ok = true;
		} while (ok == false);
		System.out.println("A média de todos os números múltiplos de 3 é:  " + media);

		leia.close();
	}

}
