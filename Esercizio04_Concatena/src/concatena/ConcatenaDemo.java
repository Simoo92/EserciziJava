package concatena;

import java.util.Scanner;

public class ConcatenaDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci tre parole");
		
		String parola1 = input.next();  // input.next se si vuole scrivere nella stessa riga mentre input.nextLine bisogna andare a capo
		String parola2 = input.next();
		String parola3= input.next();
		
		String ris = concatena(concatena(parola1,parola2) ,parola3);
		
		System.out.println(ris);
		
		
		
		
	}

	private static String concatena (String parola1, String parola2) {
		return parola1 + "*" + parola2;
	}

}
