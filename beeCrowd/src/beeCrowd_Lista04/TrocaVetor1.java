package beeCrowd_Lista04;

import java.util.Scanner;

public class TrocaVetor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int[] vetor = new int[20];
        for (int i = 0; i < 20; i++) {
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[19-i];
            vetor[19-i] = temp;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
		
		leia.close();
	}
}
