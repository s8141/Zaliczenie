package Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;









import studia.Lekcja;
import studia.Ocena;
import studia.Student;
import studia.Uczelnia;
import studia.Zaliczenie;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UczelniaTest {  
	
	private List<Student> student = new ArrayList<Student>();
    private List<Zaliczenie> zaliczenie = new ArrayList<Zaliczenie>();
	
	Uczelnia u=new Uczelnia("ug");
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUczelnia() {
		//fail("Not yet implemented");
		
		assertTrue(u.getNazwa().equals("ug"));
		assertEquals(u.getNazwa(), "ug");
        assertFalse(u.getNazwa().equals("ug"));
	}

	@Test
	public void testGetNazwa() {
		
		
		assertSame(u.getNazwa(), "ug");
		assertEquals("ug", u.getNazwa());
	}

	@Test
	public void testSetNazwa() {
	
	
		u.setNazwa("ug1");
        assertTrue(u.getNazwa().equals("ug1"));
    	
        assertEquals("ug", u.getNazwa());
	
	}

	@Test
	public void testGetStudenci() {
		

		u.getStudent("Kowalski");
        assertTrue(u.getStudenci().equals("Kowalski"));
    	
        assertEquals("Chmiel", u.getStudenci());
	
	}

	@Test
	public void testSetStudenci() {
		
	}

	@Test
	public void testGetLekcje() {
		
		
		
	}

	@Test
	public void testSetLekcje() {

	}

	@Test
	public void testAddLekcja() {
		
	     u.addLekcja(new Lekcja("wf"));
	     assertNull(u.lekcje);
	}

	@Test
	public void testAddStudent() {
		

		u.addStudent(new Student("Kjsjks", "Rusdkskld", "123"));
		assertNull(u.studenci);
		
	}

	@Test
	public void testGetLekcja() {
		assertEquals("new", u.getLekcje());
	}

	@Test
	public void testGetStudent() {
		assertEquals("Kowalski","Jan", u.getStudenci());
		
		
	}

	@Test
	public void testRemoveStudent() {
		
		
		u.addStudent(new Student("Kjsjks", "Rusdkskld", "123"));
		assertNotNull(u.studenci);
	}

	@Test
	public void testAddZaliczenie() {
		
		zaliczenie.add(new Zaliczenie(u.getStudent("3888"), 
				u.getLekcja("pmt"), 
				Ocena.DWA));
		assertTrue(zaliczenie.size()==5);
		
		
	}
	

	@Test
	public void testPrintStudentci() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintLekcje() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintZaliczenia() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintAll() {
		fail("Not yet implemented");
	}

	public void testsearchStudentByImie(){
		u.addStudent(new Student("Ilona", "Nowak","5555"));
		assertNotNull(u.getStudenci());
	}
	
    public void testsearchStudentByNazwisko(){
    	assertNotNull(u.searchStudentByNazwisko("Chmiel"));
	}
    
    public void testsearchStudentByIndeks(){
    	assertNotNull(u.searchStudentByIndeks("8745"));
	}
	
	
}
