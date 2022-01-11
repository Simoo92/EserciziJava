package view;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {

		String sceltaUmano1 = "";
		String sceltaUmano2 = "";
		String risultato = "";
		

		sceltaUmano1 = sceltaUmano1();
		sceltaUmano2 = sceltaUmano1();
		risultato = valutaScelta(sceltaUmano1, sceltaUmano2);
		System.out.println(risultato);

	}

	public static String valutaScelta(String sceltaUmano1, String sceltaUmano2) {

		String res = "";

		if (sceltaUmano1.equals(sceltaUmano2)) {
			res = "Pareggio";
		} else {

			if (sceltaUmano1.equals("rock")) {
				if (sceltaUmano2.equals("paper")) {
					res = "VinceUmano1";
				} else {
					res = "VinceUmano2";
				}
			} else {

				if (sceltaUmano1.equals("scissor")) {
					if (sceltaUmano2.equals("paper")) {
						res = "VinceUmano1";
					} else {
						res = "VinceUmano2";
					}
				} else {
					if (sceltaUmano1.equals("paper")) {
						if (sceltaUmano2.equals("rock")) {
							res = "VinceUmano1";
						} else {
							res = "VinceUmano2";
						}
					}
				}

			}

		}

		return res;
	}

	private static String sceltaUmano1() {
		System.out.println("Scegli tra rock,paper,scissor");

		Scanner input = new Scanner(System.in);
		String adc = input.nextLine();

		return adc;
	}

}
