package aula_metodos.pacote2;

public class Classe2 {
	
	public static void metodoPublic2() {
		System.out.println("Eu sou um Método Público! - Classe2");
	}
	
	public static int soma1(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao2() {
		System.out.println("Eu sou um Método Friendly! - Classe2");
	}
	
	protected static void metodoProtegido2() {
		System.out.println("Eu sou um Método Protegido! - Classe2");
	}
	
	private static void metodoPrivado2() {
		System.out.println("Eu sou um Método Privado! - Classe2");
	}
}
