package ativCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int numero = 0;
		
		for(int i = 0; i <10; i++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		if(numeros.contains(numero))
			System.out.println("O número "+ numero + " está localizado na posição: "+numeros.indexOf(numero));
		else
			System.out.println("O número "+ numero + " não foi encontrado!");
		
		leia.close();
	}

}
