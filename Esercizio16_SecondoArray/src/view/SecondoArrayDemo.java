package view;

import java.util.Scanner;

public class SecondoArrayDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numinteri = new int[10];
		int totnumeripositivi = 0;

		System.out.println("Inserisci 10 numeri interi");

		for (int i = 0; i < numinteri.length; i++) {
			numinteri[i] = input.nextInt();

			if (numinteri[i] >= 0) {
				totnumeripositivi++;
			}
		}

		int[] numamuzzo = new int[totnumeripositivi];

		for (int i = 0, j = 0; i < numinteri.length; i++) {
			if (numinteri[i] >= 0) {
				numamuzzo[j] = numinteri[i];
				j++;	
			}
		}		
		for (int i = numamuzzo.length-1; i >0; i--) {
			System.out.println(numamuzzo[i]);
		}

	}

}
