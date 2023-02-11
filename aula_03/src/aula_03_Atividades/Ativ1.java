package aula_03_Atividades;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, quantidade = 0;

		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		n2 = leia.nextInt();

		if (n1 < n2) {
			for (int contador = n1; contador <= n2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
					quantidade++;
				} else if (contador == n2 && quantidade == 0)
					System.out.println("Não há múltiplo de 3 e 5 no intervalo!");
			}
		} else
			System.out.println("Intervalo inválido!");

		leia.close();
	}

}
