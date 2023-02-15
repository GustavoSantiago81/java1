package ativCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ativ3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		int numero = 0;

		System.out.println("[Digite 10 valores inteiros não repetidos]");
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		leia.close();
	}

}
