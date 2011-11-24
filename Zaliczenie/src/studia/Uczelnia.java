package studia;

import studia.Lekcja;
import studia.Student;
import studia.Zaliczenie;

import java.util.ArrayList;
import java.util.List;


public class Uczelnia {
	public String Nazwa;

	public List<Student> studenci = new ArrayList<Student>();
	public List<Lekcja> lekcje = new ArrayList<Lekcja>();
	public List<Zaliczenie> zaliczenia = new ArrayList<Zaliczenie>();

	public Uczelnia(String nazwa) {
		this.Nazwa = nazwa;
	}

	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public List<Student> getStudenci() {
		return studenci;
	}

	public void setStudenci(List<Student> studenci) {
		this.studenci = studenci;
	}

	public List<Lekcja> getLekcje() {
		return lekcje;
	}

	public void setLekcje(List<Lekcja> lekcje) {
		this.lekcje = lekcje;
	}

	public void addLekcja(Lekcja lekcja) {
		lekcje.add(lekcja);
	}

	public void addStudent(Student student) {
		studenci.add(student);
	}
	
	public Lekcja getLekcja(String nazwaLekcji) {
		for (Lekcja lekcja : lekcje) {
			if(lekcja.getNazwa() == nazwaLekcji) {
				return lekcja;
			}
		}
		throw new IllegalStateException("Brak takiej lekcji");
	}
	
	public Student getStudent(int indeks) {
		for (Student student : studenci) {
			if(student.getIndeks() == indeks) {
				return student;
			}
		}
		throw new IllegalStateException("Brak studenta o takim indeksie: " + indeks);
	}
	
	public boolean removeStudent(int indeks) {
		Student student = this.getStudent(indeks);
		return studenci.remove(student);
	}
	
	public void addZaliczenie(Zaliczenie zaliczenie) {
		zaliczenia.add(zaliczenie);
	}

	public void printStudentci() {

		System.out.println("Studenci:");
		for (Student student : studenci) {
			student.printStudent();
		}
	}

	public void printLekcje() {

		System.out.println("Lekcje:");
		for (Lekcja lekcja : lekcje) {
			lekcja.printLekcja();
		}
	}

	public void printZaliczenia() {
		System.out.println("Zaliczenia:");
		for (Zaliczenie zaliczenie : zaliczenia) {
			zaliczenie.printZaliczenie();
		}
	}
	
	public void printAll() {
		this.printLekcje();
		this.printStudentci();
		this.printZaliczenia();
	}

}
