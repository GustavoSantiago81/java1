package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		double n1, n2;
		boolean x = true, y = false;

		System.out.println("Digite o 1º numero: ");
		n1 = leia.nextDouble();

		System.out.println("Digite o 2º numero: ");
		n2 = leia.nextDouble();
/*
		System.out.println("O numero " + n1 + " elevado ao numero " + n2 + " é igual a " + Math.pow(n1, n2));

		System.out.println("\nA raiz quadrada do numero " + n1 + " é igual a " + Math.sqrt(n1));

		System.out.println("\nA raiz quadrada do numero " + n1 + " é igual a " + df.format(Math.sqrt(n1)));

		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++n1);

		System.out.println("Pré Incremento");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);

		System.out.println(n1 = n1 + n2);
		System.out.println(n1 += n2); */
		
		System.out.println("O numero " + n1 + " somado ao numero " + n2 
				+ " é igual: " + (n1+n2));
		System.out.println("O numero " + n1 + " subtraido ao numero " + n2 
				+ " é igual: " + (n1-n2));
		if (n2 != 0)
		System.out.println("O numero " + n1 + " dividido ao numero " + n2 
				+ " é igual: " + (n1/n2));
		else
			System.out.println("Não é possível dividir um numero por zero");		//Como só tem uma ação, não é necessário colocar chave
		System.out.println("O numero " + n1 + " multiplicado ao " + n2 
				+ " é igual: " + (n1*n2));
		
		if(x)
			System.out.println("WOOOW");
		if(!y)
			System.out.println("AAAH");
		
		leia.close();
	}

}
