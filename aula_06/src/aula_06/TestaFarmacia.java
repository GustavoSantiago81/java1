package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome, nomeComercial, fabricante, foto, principioAtivo, fragancia;
		float preco;
		String opcao = "";
		int tipo;
		
		do {
			
		System.out.println("\nId: ");
		id = leia.nextLong();
		
		System.out.println("\nNome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNome Comercial: ");
		leia.skip("\\R?");
		nomeComercial = leia.nextLine();
		
		System.out.println("\nFabricante: ");
		leia.skip("\\R?");
		fabricante = leia.nextLine();
		
		System.out.println("\nFoto: ");
		leia.skip("\\R?");
		foto = leia.nextLine();
		
		System.out.println("\nPreço: ");
		preco = leia.nextFloat();
		
		System.out.println("\nTipo: ");
		tipo = leia.nextInt();
		
		// Alta abstração
		//Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco, tipo);

		switch(tipo) {
		case 1 ->{
			System.out.println("\nPrincípio ativo: ");
			leia.skip("\\R?");
			principioAtivo = leia.nextLine();
			
			Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo, principioAtivo);
			
			medicamentos.add(m1);
		}
		case 2 ->{
			System.out.println("\nFragância: ");
			leia.skip("\\R?");
			fragancia = leia.nextLine();
			
			Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);
			
			medicamentos.add(p1);
		}
		}
		
		
		System.out.println("\nDeseja continuar? ");
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		} while (opcao.equals("s"));
		
		for(var produto : medicamentos) {
			produto.reajuste(0.1f);
			produto.visualizar();
		}
		
		leia.close();
	}
}
