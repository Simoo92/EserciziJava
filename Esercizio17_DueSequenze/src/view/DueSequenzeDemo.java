package view;

import java.util.Scanner;

public class DueSequenzeDemo {

	public static void main(String[] args) {

		String[] sequenza1 = new String[5];
		String[] sequenza2 = new String[5];

		Scanner input = new Scanner(System.in);

		System.out.println("Inserire la prima sequenza");

		for (int i = 0; i < sequenza1.length; i++) {

			sequenza1[i] = input.nextLine();

		}

		System.out.println("Inserisci la seconda sequenza");

		for (int i = 0; i < sequenza2.length; i++) {
			sequenza2[i] = input.nextLine();	
		}
		
		int i=0;
		boolean trovato = false;
		// finchè i<5 e finchè non ho tovato l'elemento nella seconda sequenza di stringhe continuo il ciclo
		while (i<5 && !trovato) {
			int j =0;
			while (j<5 && !trovato) {
				if (sequenza1[i].equals(sequenza2[j]))
					trovato=true;
				j++;

			}
			
			i++;
		}
		
		if (trovato) System.out.println("Ok");
		else System.out.println("No");
		

	}

}

