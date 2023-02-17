package beeCrowd_Lista01;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, SOMA;
		
		System.out.println("Digite um número");
		A = leia.nextInt();
		System.out.println("Digite um número");
		B = leia.nextInt();
		
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		leia.close();
	}

}
