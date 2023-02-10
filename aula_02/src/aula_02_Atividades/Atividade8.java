package aula_02_Atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int codigo;
		float valor, atual = 1000;

		System.out.println("Operação: ");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		codigo = leia.nextInt();
		System.out.println("\n\n");

		switch (codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ " + atual);
			break;
		case 2:
			System.out.println("Valor: ");
			valor = leia.nextInt();
			if (valor > 0) {
				if (valor <= atual) {
					System.out.println("Operação - Saque");
					System.out.println("Saldo: R$ " + (atual - valor));
				} else {
					System.out.println("Operação - Saque");
					System.out.println("Saldo insuficiente!");
				}
			} else
				System.out.println("Valor inválido!");
			break;
		case 3:
			System.out.println("Valor: ");
			valor = leia.nextInt();
			if (valor > 0) {
				System.out.println("Operação - Depósito");
				System.out.println("Saldo: R$ " + (atual + valor));
			} else
				System.out.println("Valor inválido!");
			break;
		default:
			System.out.println("Operação inválida!");
		}

		leia.close();
	}

}
