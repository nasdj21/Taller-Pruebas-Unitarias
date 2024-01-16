package tallerpruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int[] {1,3,4,2}));
		assertEquals(-1, Calculation.findMax(new int[] {-12,-1,-3,-4,-2}));
		
		assertEquals(201, Calculation.findMax(new int[] {201,-83,-64,200,12,-88}));
		assertEquals(503, Calculation.findMax(new int[] {-121,-771,503,14,-72,105}));
		assertEquals(552, Calculation.findMax(new int[] {552,-111,-333,-44,52,112}));
	}
}