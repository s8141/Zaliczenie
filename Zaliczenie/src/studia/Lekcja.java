package studia;

public class Lekcja {
	private String Nazwa;

	public Lekcja(String nazwa) {
		this.Nazwa = nazwa;
	}

	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public void printLekcja() {
		System.out.println("Nazwa lekcji : " + Nazwa + "");
	}
}
