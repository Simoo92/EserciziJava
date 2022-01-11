package indovinaZero;

import java.util.Scanner;

public class IndovinaZeroDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double numInserito;

		boolean controllo = true;

		System.out.println("Inserisci numeri interi");

		do {

			numInserito = input.nextDouble();

			if (numInserito == 0) {
				controllo = false;
				System.out.println("Hai finito");
			} else {
				System.out.println("Inserisci un altro numero");
			}
		} while (controllo);

	}

}
