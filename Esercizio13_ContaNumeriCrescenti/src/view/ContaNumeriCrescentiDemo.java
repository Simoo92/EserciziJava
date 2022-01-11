package view;

import java.util.Scanner;

public class ContaNumeriCrescentiDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int contatore = 0;
		int valoreInserito;
		int valorePrecedente = 0;

		boolean controllovalore = false;

		System.out.println("Inserisci una sequenza di numeri");

		// finchè controllo valore è falso
		while (!controllovalore) {

			System.out.println("Inserisci un valore");

			valoreInserito = input.nextInt();

			contatore = contatore + 1;

			if (valoreInserito <= valorePrecedente) {
				controllovalore = true;
				System.out.println("Hai sbagliato ad inserire il valore");
			}
			
		
			valorePrecedente = valoreInserito;
				
		}
		
		System.out.println("il numero di elementi inseriti è: " + contatore);
	}

}
