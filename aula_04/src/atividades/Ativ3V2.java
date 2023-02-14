package atividades;

import java.util.Scanner;

public class Ativ3V2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int coluna1 = 0, linha1 = 0, coluna2 = 2, linha2 = 0, somaPrincipal = 0, somaSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Digite um nome para a posição [" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		
		System.out.println("Elementods da Diagonal principal: ");
		
		for (int contadorPrincipal = 0; contadorPrincipal < matriz.length; contadorPrincipal++) {
			System.out.println(matriz[linha1][coluna1]);
			somaPrincipal += matriz[linha1][coluna1];
			linha1++;
			coluna1++;
		}

		System.out.println("Elementods da Diagonal secundária: ");
		
		for (int contador2 = 0; contador2 < matriz.length; contador2++) {
			System.out.println(matriz[linha2][coluna2]);
			somaSecundaria += matriz[linha2][coluna2];
			linha2++;
			coluna2--;
		}

		System.out.println("Soma dos Elementods da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementods da  Diagonal Secundária: " + somaSecundaria);

		leia.close();
	}

}
