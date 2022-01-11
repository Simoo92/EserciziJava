package stampatabelline;

import java.util.Scanner;

public class StampaTabellineDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero compreso tra 1 e 20");

		int tabellinaN = 0;
		int numDato= input.nextInt();
		
		for (int i = 0; i <= 10; i++) {

			tabellinaN = i * numDato;
			
			System.out.println(tabellinaN);

		}

	}

}
