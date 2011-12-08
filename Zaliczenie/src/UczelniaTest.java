import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import studia.Lekcja;
import studia.Student;
import studia.Uczelnia;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UczelniaTest {  
	
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
		//fail("Not yet implemented"); 
		
		assertSame(u.getNazwa(), "ug");
	}

	@Test
	public void testSetNazwa() {
		//fail("Not yet implemented");
	
		u.setNazwa("ug1");
        assertTrue(u.getNazwa().equals("ug1"));

	
	}

	@Test
	public void testGetStudenci() {
		//fail("Not yet implemented");
		
	
	}

	@Test
	public void testSetStudenci() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLekcje() {
		//fail("Not yet implemented");
		
		
	}

	@Test
	public void testSetLekcje() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddLekcja() {
		
	
	}

	@Test
	public void testAddStudent() {
		

		u.addStudent(new Student("Kjsjks", "Rusdkskld", "123"));
		assertNull(u.studenci);
		
	}

	@Test
	public void testGetLekcja() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStudent() {
		
		
		
		
		u.addStudent(new Student("Kjsjks", "Rusdkskld", "123"));
		assertNotNull(u.studenci);
	}

	@Test
	public void testAddZaliczenie() {
		fail("Not yet implemented");
		
		
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

}
