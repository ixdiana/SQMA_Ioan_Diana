import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumaTest {

	Operatii mate;
	
	@Before
	public void setUp(){
		mate=new Operatii();
	}
	
	@Test
	public void testSumaCorectitudine() {
		int rezultat=mate.suma(6, 12);
		int rezultatAsteptat=18;
		assertEquals(rezultatAsteptat, rezultat);
	}

}
