package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

import atividade2.cargos.Gerente;
import atividade2.cargos.Vendedor;



public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<ClasseFuncionario> funcionarios = new ArrayList<ClasseFuncionario>();
		
		String nome;
		int cargo, telefone, idade, identidade;

		String opcao = "";
		
		do {
			
		System.out.println("\nNome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNúmero de Telefone: ");
		telefone = leia.nextInt();
		
		System.out.println("\nIdade: ");
		idade = leia.nextInt();
		
		System.out.println("\nIdentidade: ");
		identidade = leia.nextInt();
		
		//ClasseFuncionario f1 = new ClasseFuncionario(nome, cargo, telefone, idade, identidade);
		
		//funcionarios.add(f1);
		
		System.out.println("\nCargo: ");
		System.out.println("1 - Vendedor | 2 - Gerente ");
		cargo = leia.nextInt();
		
		switch(cargo) {
		case 1 -> {
			Vendedor v1 = new Vendedor(opcao, identidade, identidade, identidade, identidade, identidade);
			funcionarios.add(v1);
		}
		case 2 -> {
			Gerente g1 = new Gerente(opcao, identidade, identidade, identidade, identidade, identidade);
			funcionarios.add(g1);
		}
		}
		
		System.out.println("\nDeseja continuar? ");
		System.out.println("S - sim | N - não");
		leia.skip("\\R?");
		opcao = leia.nextLine().toUpperCase();
		
		} while (opcao.equals("S"));
		
		for(var funcionario : funcionarios)
			funcionario.visualizar();
		
		leia.close();
	}

}
