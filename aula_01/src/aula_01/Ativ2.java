package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.#");
		
		System.out.println("Digite a Nota1: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a Nota2: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a Nota3: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a Nota4: ");
		nota4 = leia.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("A média final é: " + df.format(media));

	}

}
