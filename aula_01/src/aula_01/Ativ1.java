package aula_01;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		float salário, abono, novoSalário;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o salário: ");
		salário = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		novoSalário = salário + abono;
		System.out.println("O novo salário é: " + novoSalário);
		
	}

}
