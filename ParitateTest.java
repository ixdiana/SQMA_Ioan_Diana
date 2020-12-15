import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ParitateTest {
	Operatii mate;

	@Before
	public void setUp() throws Exception {
		mate = new Operatii();
	}

	@Test
	public void testEsteParCorect(){
		assertTrue(mate.estePar(8));
		assertFalse(mate.estePar(9));
		assertFalse(mate.estePar(-9));
	}
	
	@Test
	public void testNNumerePareCorect(){
		List<Integer> lista=mate.nNumerePare(8);
		for(Integer element:lista){
			assertTrue(mate.estePar(element));
		}
	}
	
	@Test
	public void testNNumerePareDimensiune(){
		int nrElemente=8;
		List<Integer> lista=mate.nNumerePare(nrElemente);
		assertEquals(nrElemente, lista.size());
	}
	
	@Test
	public void testNNumerePareNULL(){
		List<Integer> lista=mate.nNumerePare(0);
		assertNull(lista);
	}

}
