package ativCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList<String>();
		String cor;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "º cor:");
			leia.skip("\\R?");
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: ");
		if (cores.isEmpty())
			System.out.println("\nBase de Dados vazia!");
		else
			cores.forEach(System.out::println);
		
		System.out.println("\nOrdenar as cores: ");
			cores.sort(null);
			cores.forEach(System.out::println);

	}

}
