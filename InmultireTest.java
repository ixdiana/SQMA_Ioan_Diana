package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InmultireTest {

	Operatii mate;

	@Before
	public void setUp() {
		mate = new Operatii();
	}

	@Test
	public void testMultiply() {
		Operatii mate = new Operatii();
		int[] array = { 10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2 };
		mate.inmultire(array, 10);
		assertArrayEquals(new int[] { 100, 20, 30, 100, 10, 0, 20, 30, 160, 0, 20 }, array);
	}

}
