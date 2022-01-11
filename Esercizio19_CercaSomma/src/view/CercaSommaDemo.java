package view;

import java.util.Scanner;

public class CercaSommaDemo {

	public static void main(String[] args) {

		int[] lista = new int[5];

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci 5 numeri");

		int risultato = 0;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = input.nextInt();
		}

		boolean trovato = false;
		for (int i = 0; i < lista.length; i++) {

			for (int j = i + 1; j < lista.length; j++) {
				risultato = lista[i] + lista[j];
				if (risultato == 100) {
					trovato = true;
				}

			}

		}
		if (trovato) {
			System.out.println("Ci sono due numeri con somma pari a 100");
		} else {
			System.out.println("Non ci sono due numeri con somma pari a 100");
		}

	}

}
