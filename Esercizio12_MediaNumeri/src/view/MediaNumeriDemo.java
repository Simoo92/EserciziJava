package view;

import java.util.Scanner;

public class MediaNumeriDemo {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int numIntero;
		int somma = 0;
		int nInserimenti =0;
		double res;
		
		System.out.println("Inserisci una sequenza di numeri interi positivi");
		
		do {
			System.out.println("Inserisci un valore");
			
			numIntero =input.nextInt();
			
			somma= somma + numIntero;
			
			nInserimenti= nInserimenti+1;
			
			
			
		} while (numIntero>=0);
		
		res= somma/nInserimenti;
		
		System.out.println("La media è" + res);
		
		
	}

}