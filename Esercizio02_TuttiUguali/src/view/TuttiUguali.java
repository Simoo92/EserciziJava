package view;

import java.util.Scanner;

public class TuttiUguali {

	
			// if (num1 == num2) 
		
			// if (num2 == num3) {
				
				// System.out.println("Tutti Uguali");
		//}
		
	//	else 	
		//	{
		//	System.out.println("Almeno uno è diverso");
		//	}
		
		//	else {
		//	System.out.println("Almeno uno è diverso");
			
	
	
	
	public static void main(String[] args) {

		Scanner numero = new Scanner (System.in);
		
		System.out.println("Inserisci tre numeri");
		
		int num1 = numero.nextInt();
		int num2 = numero.nextInt();
		int num3 = numero.nextInt();
		
	
		if (uguali(num1,num2,num3))
			System.out.println(" Tutti Uguali");
		else
			System.out.println("Almeno uno è diverso");
	
	
	
	}

	private static boolean uguali(int num1, int num2, int num3) {

		
		return (num1==num2 && num2 ==num3);
	}
		}
		
	

	


