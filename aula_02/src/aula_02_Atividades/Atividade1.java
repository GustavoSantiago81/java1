package aula_02_Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if((a + b) > c)
			System.out.println("A Soma de A + B É Maior do que C ");
		else if((a + b) < c)
			System.out.println("A Soma de A + B É Menor do que C ");
		else
			System.out.println("A Soma de A + B É Igual a C ");
			
		
		leia.close();
	}

}
