package numeripari;

public class NumeriInteriPari {

	public static void main(String[] args) {

		int numeroPari = 0;
		int numerodaControllare = 20;

		while (numeroPari < 10) {  //!=0 se vuoi vedere il dispari
			if (numerodaControllare %2==0) {
				System.out.println(numerodaControllare);
				numeroPari = numeroPari +1;
			}
			numerodaControllare = numerodaControllare - 1;

		}

	}

}
