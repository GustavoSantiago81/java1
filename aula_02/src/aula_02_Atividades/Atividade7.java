package aula_02_Atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, codigo;
		
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o 2º número");
		numero2 = leia.nextInt();
		System.out.println("Operação: ");
		codigo = leia.nextInt();
		System.out.println("\n\n");
		
	
		switch(codigo){
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 += numero2));		
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 -= numero2));
			break;
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 *= numero2));
			break;
		case 4:
			if(numero2 != 0)
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 /= numero2));
			else
				System.out.println("Resultado indefinido!");
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		
		leia.close();

	}

}
