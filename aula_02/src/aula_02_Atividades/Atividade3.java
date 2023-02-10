package aula_02_Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeira;

		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue do doador?: ");
		primeira = leia.nextBoolean();

		if (idade < 18 && idade > 69 )
			System.out.println(nome + " não está apto para doar sangue!");
		else if (idade >= 60 && idade <= 69 && primeira)
			System.out.println(nome + " não está apto para doar sangue!");
		else if (!primeira)
			System.out.println(nome + " está apto para doar sangue!");
		else
			System.out.println(nome + " não está apto para doar sangue!");

		leia.close();
	}

}
