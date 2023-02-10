package aula_02_Atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int cargo;
		float salario;
		
		
		System.out.println("Insira o Nome do Colaborador");
		leia.skip("\\R?");
		nome = leia.nextLine();
		System.out.println("Insira o Código do Cargo do Colaborador");
		cargo = leia.nextInt();
		System.out.println("Insira o Salário do Colaborador");
		salario = leia.nextInt();
		System.out.println("\n\n");
		
		
		switch(cargo) {
		case 1:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Gerente");			
			System.out.println("Salário: "+ (salario * 1.1));
			break;
		case 2:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Vendedor");			
			System.out.println("Salário: "+ (salario * 1.07));
			break;
		case 3:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Supervisor");			
			System.out.println("Salário: "+ (salario * 1.09));
			break;
		case 4:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Motorista");			
			System.out.println("Salário: "+ (salario * 1.06));
			break;
		case 5:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Estoquista");			
			System.out.println("Salário: "+ (salario * 1.05));
			break;
		case 6:
			System.out.println("Nome do colaborador: "+ nome);			
			System.out.println("Cargo: Técnico de TI");			
			System.out.println("Salário: "+ (salario * 1.08));
			break;
		default:
			System.out.println("Verifique o código");			
		}
		
		
		leia.close();
	}

}
