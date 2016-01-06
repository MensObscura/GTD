package ressources;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ressources.A;

public class testA {
	A a;
	
	@Before
	public void before(){
		a= new A();
	}
	
	@Test
	public void testUpJohn() {
		assertTrue(a.getJohn()==1);
		a.upJohn();
		
		assertTrue(a.getJohn()==2);

	}

	@Test
	public void testEraseToto() {

		assertTrue(a.getToto() != null);
		
		a.eraseToto();
		
		assertTrue(a.getToto()==null);
	
	}

	@Test
	public void testTotoSize() {
		
		assertTrue(a.getToto() != null);
		
		assertTrue(a.totoSize() == 4);
	}

}
