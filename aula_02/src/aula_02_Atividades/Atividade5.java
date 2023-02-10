package aula_02_Atividades;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo, quantidade;
		
		System.out.println("Insira o código do produto");
		codigo = leia.nextInt();
		System.out.println("Insira a quantidade");
		quantidade = leia.nextInt();
		System.out.println("\n\n");
		
		if(quantidade>0)
		switch(codigo){
		case 1:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (10.00*quantidade));		
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (15.00*quantidade));
			break;
		case 3:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (18.00*quantidade));
			break;
		case 4:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (12.00*quantidade));
			break;
		case 5:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (8.00*quantidade));
			break;
		case 6:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + (13.00*quantidade));
			break;
		default:
			System.out.println("Código inválido");
		}
		else
			System.out.println("Dados incorretos");
		
		leia.close();
	}

}
