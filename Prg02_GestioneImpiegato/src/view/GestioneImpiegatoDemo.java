package view;

import model.Impiegato;

public class GestioneImpiegatoDemo {

	public static void main(String[] args) {

		Impiegato i1 = new Impiegato("Simone", "Sudosi", 1500);
		Impiegato i2 = new Impiegato("Daniele", "Sudosi", 1600);
		
		i1.aumentaSalario(10);
		System.out.println(i1.getSalario());
		
		if (i1.getSalario()<i2.getSalario()) {
			System.out.println(i1.getCognome() + i1.getNome() + " è piu ricco di " + i2.getCognome() + i2.getNome() );
			
		}else {
			System.out.println(i1.getCognome() + "è meno ricco di" + i2.getNome() + "" + i2.getCognome());
		}
		
		
		
		
		
		
	}

}
