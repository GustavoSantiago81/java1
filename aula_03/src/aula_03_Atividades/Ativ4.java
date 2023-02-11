package aula_03_Atividades;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0, idadeS = 0, sexoS = 0,
				categoriaS = 0;
		String continua = "S";

		while (continua.equals("S")) {

			do {
				System.out.println("Digite a idade: ");
				idade = leia.nextInt();
				if (idade <= 0) {
					idadeS = 1;
					System.out.println("Idade inválida! \n");
				} else
					idadeS = 0;

			} while (idadeS == 1);

			do {
				System.out.println("\nDigite o sexo: ");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino");
				System.out.println("3 - Outros");
				sexo = leia.nextInt();

				if (sexo < 1 || sexo > 3) {
					sexoS = 1;
					System.out.println("Opção inválida! \n");
				} else
					sexoS = 0;
			} while (sexoS == 1);

			do {
				System.out.println("\nDigite a categoria: ");
				System.out.println("1 - Backend");
				System.out.println("2 - Frontend");
				System.out.println("3 - Mobile");
				System.out.println("4 - FullStack");
				categoria = leia.nextInt();

				if (categoria < 1 || categoria > 4) {
					categoriaS = 1;
					System.out.println("Opção inválida! \n");
				} else
					categoriaS = 0;
			} while (categoriaS == 1);
			
			

			if (categoria == 1)
				backend++;

			if (categoria == 2 && sexo == 2)
				frontend++;

			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;

			if (categoria == 4 && sexo == 2 && idade < 30)
				full++;

			System.out.println("\nDeseja continuar (S/N):  ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("\nTotal de pessoas desenvolvedoras Mobile maiores de 40 anos: " + mobile);
		System.out.println("\nTotal de pessoas desenvolvedoras Fullstack menores de 30 anos: " + full);

		leia.close();
	}

}
