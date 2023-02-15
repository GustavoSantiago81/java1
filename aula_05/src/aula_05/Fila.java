package aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elizangela");

		Iterator<String> iFila = fila.iterator();

		while (iFila.hasNext()) {
			System.out.println(iFila.next());
		}

		System.out.println("Retirar elemento da fila");

		System.out.println(fila.poll());

		System.out.println("Fila atualizada");

		System.out.println(fila); // Legal - Linear

		System.out.println(fila.peek()); // Mostrar 1º Elemento

		System.out.println(fila.size()); // Tamanho da Fila

		// for Porque Iterator só funciona em um momento
		for (var elemento : fila) {
			System.out.println(elemento);
		}

	}

}
