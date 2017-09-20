/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw21752927
 *
 */
public class MainTest {
	
	private static Main main;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass method");
		main = new Main();	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] {1,2,3}));
		assertEquals(0, main.findSmallest(new int[] {4,0,1,2,3}));
		assertEquals(-2, main.findSmallest(new int[] {1,-2,3}));
		assertEquals(1, main.findSmallest(new int[] {1,1,1}));
		assertEquals(3, main.findSmallest(new int[] {3}));

	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testSum() {
		assertEquals(6, main.sum(new int[] {1,2,3}));
		assertEquals(2, main.sum(new int[] {1,-2,3}));
		assertEquals(3, main.sum(new int[] {3}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testFrequency() {
		assertEquals(3, main.frequency(new int[] {5,4,9,2,-6,85,2,6,2}, 2));
		assertEquals(0, main.frequency(new int[] {5,4,9,2,-6,85,2,6,2}, 25));
		assertEquals(1, main.frequency(new int[] {5,4,9,2,-6,85,2,6,2}, -6));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
@SuppressWarnings("deprecation")
	//@Ignore("El tractarem més tard")
	@Test
	public final void testFrequencyPercentage() {
		assertEquals(33, main.frequencyPercentage(new int[] {5,4,9,2,-6,85,2,6,2}, 2), 0.1);
		assertEquals(0, main.frequencyPercentage(new int[] {5,4,9,2,-6,85,2,6,2}, 25), 0.001);
		assertEquals(11, main.frequencyPercentage(new int[] {5,4,9,2,-6,85,2,6,2}, -6), 0.001);	
	}

}
