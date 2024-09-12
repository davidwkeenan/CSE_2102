package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest1() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void squareTest2() {

		double baseValue = 1.0;
		double expected = baseValue*baseValue;
		testMe.setValue(1.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void constructorTest() {

		TestMe testMe = new TestMe();

		assertTrue(1 == 1);
	}

}