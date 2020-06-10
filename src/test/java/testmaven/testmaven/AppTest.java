package testmaven.testmaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Rigorous Test :-)
	 */
	public AppTest(String testName) {
		// TODO Auto-generated constructor stub
		super(testName);
	}

	public void testApp() {
		// TODO Auto-generated method stub
		assertTrue(true);
	}

	@Test
	public void shouldAnswerWithTrue() {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(2);
		assertTrue(result);
	}

	@Test
	public void testIsEventNumber4() {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(4);
		assertTrue(result);
	}
}
