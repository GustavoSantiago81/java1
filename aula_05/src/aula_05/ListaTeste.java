package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTeste {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Double numero = 0.0; // Ctrl + em cima de qualquer classe

		ArrayList<Double> notas = new ArrayList<Double>();

		double x;

		do {
			System.out.println("Entre com número");
			x = leia.nextDouble();
			notas.add(x);
		} while (x != 0);

		for (var nota : notas) {
			System.out.println(nota);
		}
		
		
		leia.close();
	}

}
