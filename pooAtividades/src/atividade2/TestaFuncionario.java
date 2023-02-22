package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

import atividade1.ClasseCliente;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<ClasseCliente> funcionarios = new ArrayList<ClasseCliente>();
		
		String nome;
		String cargo;
		int telefone;
		int idade;
		int identidade;

		String opcao = "";
		
		do {
			
		System.out.println("\nNome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nCargo: ");
		leia.skip("\\R?");
		cargo = leia.nextLine();
		
		System.out.println("\nNúmero de Telefone: ");
		telefone = leia.nextInt();
		
		System.out.println("\nIdade: ");
		idade = leia.nextInt();
		
		System.out.println("\nIdentidade: ");
		identidade = leia.nextInt();
		
		ClasseCliente f1 = new ClasseCliente(nome, cargo, telefone, idade, identidade);
		
		funcionarios.add(f1);
		
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
