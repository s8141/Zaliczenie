package studia;

public class Student {
	private String imie;
	private String nazwisko;
	private int indeks;

	public Student(String imie, String nazwisko, int indeks) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.indeks = indeks;
	}

	public void printStudent() {
		System.out.println("Imie: " + imie + "\n Nazwisko: " + nazwisko
				+ "\n Indeks: " + indeks + "\n ");
	}


	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getIndeks() {
		return this.indeks;
	}

	public void setIndeks(int indeks) {
		this.indeks = indeks;
	}
}
