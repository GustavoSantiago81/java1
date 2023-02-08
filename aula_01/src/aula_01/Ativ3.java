package aula_01;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		float salarioBruto, adicional, extras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicional = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		extras = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		salarioLiquido = (salarioBruto + adicional + (extras*5) - descontos);
		System.out.println("O Salário Líquido é: " + salarioLiquido);

	}

}
