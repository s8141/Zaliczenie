package studia;

import studia.Lekcja;
import studia.Student;
import studia.Zaliczenie;

import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.List;




public class Uczelnia {
	public String Nazwa;

	public List<Student> studenci = new ArrayList<Student>();
	public List<Lekcja> lekcje = new ArrayList<Lekcja>();
	public List<Zaliczenie> zaliczenia = new ArrayList<Zaliczenie>();

	public Object add;

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
	
	public Student getStudent(String indeks) {
		for (Student student : studenci) {
			if(student.getIndeks() == indeks) {
				return student;
			}
		}
		throw new IllegalStateException("Brak studenta o takim indeksie: " + indeks);
	}
	
	/* metody do szukania studentów  */

  
     
                                       /*
	                                    public ArrayList<Student> searchStudentByPhrase (String phrase) {
	        
                                        ArrayList<Student> a = new ArrayList<Student>();
        
                                        for (Student s : studenci) {
                                        if (s.getImie().toLowerCase().indexOf(phrase.toLowerCase()) != -1
                                        || s.getNazwisko().toLowerCase().indexOf(phrase) != -1) {
        
                                        a.add(s);
                                        }
                                        }
		                                return a;

      
                                        }
                                        */     
          public ArrayList<Student> searchStudentByImie (String imie)/* throws MarshalException */{
        
         ArrayList<Student> a = new ArrayList<Student>();
        
         for (Student s : studenci) {
         if (s.getImie() == imie) {
         a.add(s);
         }
         }
        
       /*  if (a.isEmpty()) throw new MarshalException("Brak studenta o imieniu" + imie + ".");
         else return a;  */
         return a;
          }
          
          public ArrayList<Student> searchStudentByNazwisko (String nazwisko)  {
              
              ArrayList<Student> a = new ArrayList<Student>();
             
              for (Student s : studenci) {
              if (s.getNazwisko() == nazwisko) {
              a.add(s);
              }
              }
             
             
               return a;
               }
               
          public ArrayList<Student> searchStudentByIndeks (String indeks)  {
              
              ArrayList<Student> a = new ArrayList<Student>();
             
              for (Student s : studenci) {
              if (s.getIndeks() == indeks) {
              a.add(s);
              }
              }
             
             
               return a;
               }
          
          
     /*metoda do usowania studentow*/  
          
     public boolean removeStudent(String indeks) {
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
	
	public void printStudentByNazwisko (String nazwisko) {
      
        System.out.println("Student o nazwisku " + nazwisko + ": ");
        System.out.println(searchStudentByNazwisko(nazwisko) + "\n");
     
       
	}
     /*    
       public void printStudentByPhrase (String phrase) {

        System.out.println("student z fraza " + phrase + ": ");
        printStudentByPhrase(searchStudentByPhrase(phrase));
      
      }
       */  
        public void printStudentByImie (String imie) {
       // try {
        System.out.println("student o imieniu " + imie + ": ");
        System.out.println(searchStudentByImie(imie) + "\n");
       // printStudentByPhrase(searchStudentByImie(imie));
       //  } catch (MarshalException e) {
       //   e.print();
       //  }
         }
        
        
        public void printStudentByIndeks (String indeks) {
            
            System.out.println("Student o indeksie " + indeks + ": ");
            System.out.println(searchStudentByIndeks(indeks) + "\n");
         
           
    	}
             
	
	public void printAll() {
		this.printLekcje();
		this.printStudentci();
		this.printZaliczenia();
	}

}
