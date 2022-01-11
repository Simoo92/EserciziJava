package view;

import model.Persona;

public class Principale {

	public static void main(String[] args) {

		Persona p1 = new Persona ("Gino","Baudo",18);
		Persona p2 = new Persona ("Pino", "Rossi",20);
		Persona p3= p1;
		System.out.println(p3);
		
		
	}

}
