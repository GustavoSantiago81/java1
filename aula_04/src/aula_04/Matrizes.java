package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float [][] matriz = new float[2][2];
		
	/*	// Ler as linhas
		for (int i = 0; i < matrizInteiros.length; i++) {

			// ler as colunas
			for (int j = 0; j < matrizInteiros.length; j++) {

				System.out.println(matrizInteiros[i][j]);
			}
		}
		*/
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite uma valor Real: ");
				matriz[i][j] = leia.nextFloat();
			}
		}
		
		for(float[] vetor : matriz) {
			for(var elemento : vetor) {
				System.out.println(elemento);
			}
		}
		
		leia.close();
	}

}
