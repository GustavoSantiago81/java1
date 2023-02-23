package atividade1;

import java.util.ArrayList;
import java.util.Scanner;

import atividade1.pessoa.PessoaFisica;
import atividade1.pessoa.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<ClasseCliente> clientes = new ArrayList<ClasseCliente>();

		String nome, email, opcao = "", identidade, cnpj;
		int telefone, produto, id, tipo;

		do {

			System.out.println("\nNome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.println("\nEmail: ");
			leia.skip("\\R?");
			email = leia.nextLine();

			System.out.println("\nTelefone: ");
			telefone = leia.nextInt();

			System.out.println("\nproduto: ");
			leia.skip("\\R?");
			produto = leia.nextInt();

			System.out.println("\nid: ");
			id = leia.nextInt();

			// Alta abstração
			//ClasseCliente c1 = new ClasseCliente(nome, email, telefone, produto, id);
			
			System.out.println("\nTipo: ");
			tipo = leia.nextInt();

			switch (tipo) {
			case 1 -> {
				System.out.println("\nIdentidade: ");
				leia.skip("\\R?");
				identidade = leia.nextLine();

				PessoaFisica pf1 = new PessoaFisica(nome, email, telefone, produto, id, identidade);
				clientes.add(pf1);
			}
			case 2 -> {
				System.out.println("\nCNPJ: ");
				leia.skip("\\R?");
				cnpj = leia.nextLine();

				PessoaJuridica pj1 = new PessoaJuridica(nome, email, telefone, produto, id, cnpj);

				clientes.add(pj1);
			}
			}


			System.out.println("\nDeseja continuar? ");
			System.out.println("S - sim | N - não");
			leia.skip("\\R?");
			opcao = leia.nextLine().toUpperCase();

		} while (opcao.equals("S"));

		for (var cliente : clientes)
			cliente.visualizar();

		leia.close();
	}

}
