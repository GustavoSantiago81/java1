package aula_02_Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String subfilo, classe, cadeia;
				
		
		System.out.println("O animal é vertebrado ou invertebrado: ");
		leia.skip("\\R?");
		subfilo = leia.nextLine();
		System.out.println("O animal é Ave, Mamífero, Inseto ou Anelídeo?: ");
		leia.skip("\\R?");
		classe = leia.nextLine();
		System.out.println("O animal é Carnívoro, Hematófago, Herbívoro ou Onívoro: ");
		leia.skip("\\R?");
		cadeia = leia.nextLine();
		
		
		if(subfilo.equals("vertebrado")) {
			if(classe.equals("ave")) {
				if(cadeia.equals("carnivoro")) {
					System.out.println("Águia");
				}
				else
					System.out.println("pomba");
			}else {
				if(classe.equals("onivoro")) {
					System.out.println("Homem");
				}
				else
					System.out.println("vaca");
			}
		} else {
			if(classe.equals("inseto")) {
				if(cadeia.equals("herbivoro")) {
					System.out.println("Largata");
				}
				else
					System.out.println("Pulga");
			}else {
				if(classe.equals("onivoro")) {
					System.out.println("Minhoca");
				}
				else
					System.out.println("Sanguessuga");
			}
			
		}
				
		
		
		
		
		leia.close();
	}

}
