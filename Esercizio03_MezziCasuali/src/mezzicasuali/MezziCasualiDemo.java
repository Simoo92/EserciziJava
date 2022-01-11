package mezzicasuali;

public class MezziCasualiDemo {

	public static void main(String[] args) {

		double numeroStampa;
		numeroStampa = ottieninumeroCasuale();

		if (numeroStampa < 0.5) {
			System.out.println(" numero casuale" + numeroStampa);

		} else {
			if (numeroStampa >= 0.5) {
				System.out.println("numero estratto:" + numeroStampa + "---risultato: " + (numeroStampa - 0.5));

			}

		}

	}

	public static double ottieninumeroCasuale() {
		double casuale = Math.random();
		return casuale;
	}

}
