package studia;




import com.pl.kasia.services.LekcjaDBManager;
import com.pl.kasia.services.StudentDBManager;

import studia.*;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uczelnia uczelnia = new Uczelnia("PJWSTK");
		
		// Dodajemy studentów
		uczelnia.addStudent(new Student("Darek", "Kowalski", "4555"));
		uczelnia.addStudent(new Student("Jan", "Kwaśny"," 4234"));
		uczelnia.addStudent(new Student("Kuba", "Nowak", "1347"));
		uczelnia.addStudent(new Student("Joanna", "Traugut", "3487"));
		uczelnia.addStudent(new Student("Asia", "Chmiel", "8431"));
		uczelnia.addStudent(new Student("Kinga", "Rusin", "3487"));

		// Dodajemy lekcje
		uczelnia.addLekcja(new Lekcja("MPR"));
		uczelnia.addLekcja(new Lekcja("POZ"));
		uczelnia.addLekcja(new Lekcja("ANGIELKSI"));
		uczelnia.addLekcja(new Lekcja("WF"));
		
		
		 // uczelnia.printStudentci();
	     // uczelnia.printStudentByImie("Kuba");
	     // uczelnia.printStudentByNazwisko("Chmiel");
	     //uczelnia.printStudentByPhrase("cek");
	     // uczelnia.printStudentByIndeks("8431");
	     
		 StudentDBManager db = new StudentDBManager ();
	     db.DodajStudent(new Student("Adam","Kniter", "2554"));  
	     db.DodajStudent(new Student ("Ilona", "Ma�lak", "5655"));
	     
	     LekcjaDBManager db1 = new LekcjaDBManager();
	     db1.DodajLekcje(new Lekcja("francuski"));
	
	     Lekcja Lekcja1 = new Lekcja ( "niemiecki");
	     db1.DodajLekcje(Lekcja1);
	     db1.ZnajdzLekcjePoNazwie("niemiecki");
	     
	     Lekcja Lekcja2 = new Lekcja ( "rosyjski");
	     db1.DodajLekcje(Lekcja2);
	     db1.ZnajdzLekcjePoNazwie("rosyjski");
	     
	
	     Lekcja Lekcja3 = new Lekcja ( "angielski");
	 	 db1.DodajLekcje(Lekcja3);
	 	 db1.ZnajdzLekcjePoNazwie("angielski");
	 	 
	 	 db1.UsunLekcje(null);
	 	
	 	
		try {
			uczelnia.addZaliczenie(new Zaliczenie(
				uczelnia.getStudent("3487"), 
				uczelnia.getLekcja("POZ"), 
				Ocena.PIEC
			));
			uczelnia.addZaliczenie(new Zaliczenie(
				uczelnia.getStudent("1347"), 
				uczelnia.getLekcja("ANGIELKSI"), 
				Ocena.DWA
			));
			uczelnia.addZaliczenie(new Zaliczenie(
				uczelnia.getStudent("3487"), 
				uczelnia.getLekcja("WF"), 
				Ocena.TRZY
			));
		
		} catch (IllegalStateException exception) {
		      exception.printStackTrace();
	    }
		//uczelnia.printLekcje();
		//uczelnia.printStudentci();
		uczelnia.printZaliczenia();
	}
  
	
}
