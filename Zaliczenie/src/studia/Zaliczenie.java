package studia;

public class Zaliczenie {
	
	private Student student;
	private Lekcja lekcja;
	private Ocena ocena;
	
	public Zaliczenie(Student student, Lekcja lekcja, Ocena ocena) {
		this.student = student;
		this.lekcja = lekcja;
		this.ocena = ocena;
	}
	
	public void printZaliczenie() {
		System.out.println("Student:");
		System.out.println("imie: " + this.student.getImie());
		System.out.println("nazwisko: " + this.student.getNazwisko());
		System.out.println("indeks: " + this.student.getIndeks());
		System.out.println("lekcja: " + this.lekcja.getNazwa());
		System.out.println("ocena: " + this.ocena.getOcena() + "\n");
	}
}
