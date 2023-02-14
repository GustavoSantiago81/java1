package atividades;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float matriz[][] = new float[3][4];
		float media[] = new float[3];
		float soma = 0.0f;

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ++) {

				System.out.println("Digite a nota: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();

			}
		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ++) {

				soma += matriz[indiceI][indiceJ];

			}

			media[indiceI] = soma / matriz[indiceI].length;
			soma = 0.0f;

		}

		for(var medias: media)
			System.out.println(medias);
		
		leia.close();
	}

}
