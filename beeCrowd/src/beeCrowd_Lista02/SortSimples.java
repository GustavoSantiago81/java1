package beeCrowd_Lista02;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        System.out.println(arr[0] + "\n" + arr[1] + "\n" + arr[2]);

        System.out.println();

        System.out.println(a + "\n" + b + "\n" + c);
        
        leia.close();
	}
}
