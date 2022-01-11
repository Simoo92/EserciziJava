package view;

import java.util.Scanner;

public class ScrivoScrivoScrivoDemo {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	System.out.println("Inserisci un numero maggiore o uguale di 0");
	
	int numInserito = input.nextInt();
	
		
		if (numInserito>=0) {
			for (int i = 0; i <numInserito; i++) {
				System.out.println("Sto Ciclando");
			}
		} else {
			System.out.println("Errore");

		}
		
		
		
		
		
		
	}

}
