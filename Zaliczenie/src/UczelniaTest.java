import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import studia.Lekcja;
import studia.Student;
import studia.Uczelnia;


public class UczelniaTest {

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
		fail("Not yet implemented");
	}

	@Test
	public void testGetNazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudenci() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStudenci() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLekcje() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLekcje() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddLekcja() {
		
	
	//	Lekcja l=new Lekcje("kakak");
	//	l.add.Lekcje(l);
		
	//	assertTrue("nie dodało elementu ", l.getLekcje());
		
	}

	@Test
	public void testAddStudent() {
		fail("Not yet implemented");
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
		
		
		Uczelnia u=new Uczelnia("pjwww");
		
		u.addStudent(new Student("Kjsjks", "Rusdkskld", 347645));
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
