package view;

public class StampaZigZagDemo {

	public static void main(String[] args) {

		int[] valori = { 4, 5, 8, 6, 7, 9, 10, 1, 3, 2 };
		for (int i = 0, j = valori.length-1 ; i < valori.length / 2; i++, j--) {
			
			System.out.println(valori[i]); //prendo l'array ma voglio l'elemento iesimo 
			System.out.println(valori[j]);

		}

	}

}
