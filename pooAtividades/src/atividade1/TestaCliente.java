package atividade1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<ClasseCliente> clientes = new ArrayList<ClasseCliente>();
		
		String nome;
		String email;
		int numero;
		int idade;
		int identidade;

		String opcao = "";
		
		do {
			
		System.out.println("\nNome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nEmail: ");
		leia.skip("\\R?");
		email = leia.nextLine();
		
		System.out.println("\nNúmero: ");
		numero = leia.nextInt();
		
		System.out.println("\nIdade: ");
		leia.skip("\\R?");
		idade = leia.nextInt();
		
		System.out.println("\nIdentidade: ");
		identidade = leia.nextInt();
		
		ClasseCliente c1 = new ClasseCliente(nome, email, numero, idade, identidade);
		
		clientes.add(c1);
		
		System.out.println("\nDeseja continuar? ");
		System.out.println("S - sim | N - não");
		leia.skip("\\R?");
		opcao = leia.nextLine().toUpperCase();
		
		} while (opcao.equals("S"));
		
		for(var cliente : clientes)
			cliente.visualizar();
		
		
		leia.close();
	}

}
