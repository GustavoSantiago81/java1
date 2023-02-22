package mtransporte;

import java.util.Scanner;

public class TestaTransporte {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Transporte t1 = new Transporte(5);

		Transporte t2 = new Transporte();

		Terrestre tr1 = new Terrestre(5, 4, 200);

		Automovel a1 = new Automovel(5, 4, 200, "Branco", 4, "XPT-2131", 5);
		
		leia.skip("\\R?");
		String pao = leia.nextLine();

		
		t1.visualizar();
		
		System.out.println("\n");
		
		tr1.visualizar();
		
		System.out.println("\n");
		
		a1.visualizar();
		
		t2.visualizar();
		
		a1.mensagem(pao);
		
		a1.mensagem("O carnaval acabou! ");
	}

}
