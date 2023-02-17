package aula_metodos;

import static aula_metodos.pacote2.Classe2.*;		// Teve que inserir manualmente, significa trazer tudo

public class TestaMetodos {

	public static void main(String[] args) {
		
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		System.out.println("\n");
		
		Classe1.metodoPublic1();
		Classe1.metodoPadrao1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1();
		System.out.println("\n");
		
		metodoPublic2();
		/*metodoPadrao2();
		metodoProtegido2();
		metodoPrivado2();*/
		System.out.println("\n");
		
		System.out.println(soma(1, 5));
	}
	
	public static void metodoPublic() {
		System.out.println("Eu sou um Método Público!");
	}
	
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao() {
		System.out.println("Eu sou um Método Friendly!");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido!");
	}
	
	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado!");
	}

}
