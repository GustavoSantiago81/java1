package aula_01;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {
		int n1, n2, n3, n4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o Número 1: ");
		n1 = leia.nextInt();
		System.out.println("Digite o Número 2: ");
		n2 = leia.nextInt();
		System.out.println("Digite o Número 3: ");
		n3 = leia.nextInt();
		System.out.println("Digite o Número 4: ");
		n4 = leia.nextInt();
		diferenca = (n1*n2)-(n3*n4);
		System.out.println("A diferença é: " + diferenca);
	}

}
