package calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Calculos calc = new Calculos(); // Não precisa colocar static, só instanciar

		int opcao;
		double numero1, numero2;

		while (true) {

			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão\n");

			System.out.println("Digite o número da Operação: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				leia.close();
				System.exit(0);		// Legal, Sai do Loop
			}

			System.out.println("Digite o primeiro número: ");
			numero1 = leia.nextDouble();

			System.out.println("Digite o segundo número: ");
			numero2 = leia.nextDouble();

			switch (opcao) {
			case 1 -> System.out.println("Soma: " + Calculos.soma(numero1, numero2));
			case 2 -> System.out.println("Subtração: " + Calculos.subtracao(numero1, numero2));
			case 3 -> System.out.println("Multiplicação: " + Calculos.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Divisão: " + Calculos.divisao(numero1, numero2));
			default -> System.out.println("Função Inválida");
			}
		}

	}

}
