import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		boolean ok = false;
		String continua;

		/*
		 * do { System.out.println("Digite a Tabuada que você deseja calcular: ");
		 * numero = leia.nextInt(); } while (numero < 1 || numero > 10);
		 * 
		 * for (int contador = 1; contador <= 10; contador++) { System.out.println("\n"
		 * + numero + " x " + contador + " = " + (numero * contador)); }
		 */
		do {
			do {
				System.out.println("Digite a Tabuada que você deseja calcular: ");
				numero = leia.nextInt();
				if (numero < 1 || numero > 10)
					System.out.println("entre 1 e 10");
				else
					ok = true;
			} while (ok == false);
			
			int contador = 1;
			
			while( contador <= 10) {
				System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
				 contador++;
			}
			System.out.println("Deseja continuar(S/N)");
			leia.skip("\\R?");
			continua = leia.nextLine();
			
			ok =false;

		} while (continua.equalsIgnoreCase("S"));

		leia.close();
	}

}
