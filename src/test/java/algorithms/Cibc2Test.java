package algorithms;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Cibc2Test {


	
	@Test
	public void test1() {
		int[] D = { 2, 5 };
		String[] T = { "PGP", "M" };
		RecyclingGarbageTrucks2 cibc = new RecyclingGarbageTrucks2();
		int actual = cibc.getMaxTime(T, D);
		int expected = 15;
		assertEquals(expected, actual);
		//assertEquals(expected, actual, "The getMaxTime method should return 15 for the given inputs.");
	}
	
	@Test
	public void test2() {
		int[] D = { 3, 2, 4 };
		String[] T = { "MPM", "", "G" };
		RecyclingGarbageTrucks2 cibc = new RecyclingGarbageTrucks2();
		int actual = cibc.getMaxTime(T, D);
		int expected = 19;
		assertEquals(expected, actual);
	}
	
	@Test
	public void tes3() {
		int[] D = { 2, 1, 1, 1, 2 };
		String[] T = { "", "PP", "PP", "GM", "" };
		RecyclingGarbageTrucks2 cibc = new RecyclingGarbageTrucks2();
		int actual = cibc.getMaxTime(T, D);
		int expected = 12;
		assertEquals(expected, actual);
	}

}
