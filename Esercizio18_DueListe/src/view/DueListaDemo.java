package view;

import java.util.Scanner;

public class DueListaDemo {

	public static void main(String[] args) {

		int [] lista1 = new int [5];
		int [] lista2 = new int [5];
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci 5 numeri");
		
		for (int i = 0; i < lista1.length; i++) {
			lista1[i]= input.nextInt();
		}
		
		System.out.println("Inserisci altri 5 numeri");
		
		for (int j = 0; j < lista2.length; j++) {
			lista2[j] = input.nextInt();
		}
		
		int risultato = 0;
		for (int i = 0, j=0; i < 5; i++,j--) {
			risultato=lista1[i]+lista2[j];
			
			System.out.println("La somma è " + risultato);
			
			
//			int risultato = 0;
//			for (int i = 0,j=lista2.length-1 ; i < 5; i++,j--) {
//				risultato=lista1[i]+lista2[j];	
			
			
			
			
			
			
		}
		
		
		
	}

}
