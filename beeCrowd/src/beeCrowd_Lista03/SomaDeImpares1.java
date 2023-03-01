package beeCrowd_Lista03;

import java.util.Scanner;

public class SomaDeImpares1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x = leia.nextInt();
		int y = leia.nextInt();
		int soma = 0;

		if (x > y) {
			int troca = x;
			
			x = y;
			y = troca;
		}
		
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		leia.close();
	}
}
