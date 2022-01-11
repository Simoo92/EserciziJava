package view;

import java.util.Scanner;

public class ContinuaFinoDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di interi");
		
		boolean valido;
		
		int somma=0;
		
		
		
		do {
			int num = input.nextInt();
			valido = (num <0 && num %2 ==0) || (num >= 0 && num%3==0);
			if (valido) somma+=num;
			
			
		} while (valido);
		
		System.out.println("la somma è" + somma);
		
		
		
	}

}
