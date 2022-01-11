package view;

import java.util.Scanner;

public class Prova123 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] provaArray = new int [10];
		int[] provaArray1 = new int[10];
		
		System.out.println("inserisci valori nel array");
		
		for (int i = 0; i < provaArray.length; i++) {
			provaArray[i] = input.nextInt();
		}
		
		System.out.println("inserisci valori nel array n2");

		
		for (int i = 0; i < provaArray1.length; i++) {
			provaArray1[i] = input.nextInt();
		}
		
	}

}
