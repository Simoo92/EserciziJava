package Ripeti;

import java.util.Scanner;

public class RipetiDemo {

	public static void main(String[] args) {

		
	Scanner input = new Scanner (System.in);
	
	System.out.println("Inserisci una stringa");
	
	String s = input.nextLine();
	
	System.out.println("Inserisci un numero intero positivo");
	
	int n= input.nextInt();
	
	ripetitore (s,n);

	}
	


	private static void ripetitore (String str, int num)  {
		
	
		if (num <0) System.out.println("ERRORE : numero negativo");
		else 
			
			for (int i = 0; i < num; i++) {
				System.out.println(str);
			}
	
	} 
	

}
