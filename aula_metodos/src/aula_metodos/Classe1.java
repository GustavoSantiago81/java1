package aula_metodos;

public class Classe1 {
	
	public static void metodoPublic1() {
		System.out.println("Eu sou um Método Público!");
	}
	
	public static int soma1(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao1() {
		System.out.println("Eu sou um Método Friendly!");
	}
	
	protected static void metodoProtegido1() {
		System.out.println("Eu sou um Método Protegido!");
	}
	
	private static void metodoPrivado1() {
		System.out.println("Eu sou um Método Privado!");
	}

}
