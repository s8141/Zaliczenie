package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import studia.Student;


public class StudentTest {
 
	Student s=new Student("imi", "nazwisk", "indeks");
	
	@Test
	public void testStudent() {
	
		assertTrue(s.getNazwisko().equals("nazwisk"));
		assertEquals(s.getImie(), "imi");
	
		
		assertTrue(s.getImie().equals("Juzio"));
		assertEquals("naz", s.getNazwisko());
		
		
	}

	@Test
	public void testPrintStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImie() {
		
		assertSame(s.getImie(), "imi");
		assertEquals("Kuba", s.getImie());
	}

	@Test
	public void testSetImie() {
		
		
		s.setImie("imi");
        assertTrue(s.getImie().equals("imi"));
		assertEquals("Joanna", s.getImie());
	}

	@Test
	public void testGetNazwisko() {
		
		assertSame(s.getNazwisko(), "nazwisk");
		
	}

	@Test
	public void testSetNazwisko() {
		
		s.setNazwisko("nazwisko");
        assertTrue(s.getNazwisko().equals("nazwiasko"));      
		assertFalse(s.getNazwisko()=="Chmiel");
		assertEquals("Nazwisko", s.getNazwisko());
		
	}

	@Test
	public void testGetIndeks() {
	
		assertSame(s.getIndeks(), "indeks");
		
	}

	@Test
	public void testSetIndeks() {
		
		s.setIndeks("7777");
        assertFalse(s.getIndeks().equals("7777"));
        
     

	}

}
