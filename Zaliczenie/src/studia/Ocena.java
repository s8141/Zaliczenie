package studia;

public enum Ocena {
	DWA ("Straszna lipa"), 
	TRZY ("Bywal lepiej"),
	CZTERY ("dobrze"),
	PIEC ("Swietnie");
	
	private final String ocena;
	
	Ocena(String nazwa) {
		this.ocena = nazwa;
	}
	
	public String getOcena () {
		return this.ocena;
	}
}
