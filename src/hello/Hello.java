package hello;

public class Hello {

	public static void main(String[] args) {
System.out.println("Pierwsza wersja");
System.out.println("Druga wersja");
	Osoba ala = new Osoba ( "Ala", "Kowalska", "2002-03-03");
	System.out.println(ala);

	Konto konto = new Konto ( 11, 2000,ala);
	konto.wplata(500);
	System.out.println(konto);
	System.out.println("Jedak nie koniec");
	

	}

}
