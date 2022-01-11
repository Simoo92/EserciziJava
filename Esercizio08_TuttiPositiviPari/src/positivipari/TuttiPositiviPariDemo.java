package positivipari;

import java.util.Scanner;

public class TuttiPositiviPariDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire");

		int numPositiviPari;
		int numScelti = input.nextInt();

		Boolean PositiviPari = true;
		for (int i = 0; i < numScelti; i++) {
			System.out.println("inserisci il prossimo numero");
			int n= input.nextInt();
			if  (n <0 || n %2!=0)
				PositiviPari = false;

		}

		if (PositiviPari)

			System.out.println("Tutti positivi e pari");

		else
			System.out.println("NO");

	}

}
