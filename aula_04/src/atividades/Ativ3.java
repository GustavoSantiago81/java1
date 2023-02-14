package atividades;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		int somaPrincipal = 0, somaSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.println("Digite um nome para a posição [" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (linha == 0 && coluna == 0 || linha == 1 && coluna == 1 || linha == 2 && coluna == 2) {
					System.out.println(matriz[linha][coluna]);

					somaPrincipal += matriz[linha][coluna];
				}
			}
		}

		System.out.println("Diagonal secundária: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (linha == 0 && coluna == 2 || linha == 1 && coluna == 1 || linha == 2 && coluna == 0) {
					System.out.println(matriz[linha][coluna]);

					somaSecundaria += matriz[linha][coluna];
				}
			}
		}

		System.out.println("Soma Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma Diagonal Secundária: " + somaSecundaria);

		leia.close();
	}

}
