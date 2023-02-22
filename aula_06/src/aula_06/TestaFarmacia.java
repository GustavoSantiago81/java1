package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome, nomeComercial, fabricante, foto;
		float preco;
		String opcao = "";
		
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
		leia.skip("\\R?");
		preco = leia.nextFloat();
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		
		medicamentos.add(f1);
		
		System.out.println("\nDeseja continuar? ");
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		} while (opcao.equals("s"));
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		
		//Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", " - ", 10.0f);
	
		//f1.visualizar();

		//f2.visualizar();
		
		leia.close();
	}
}
