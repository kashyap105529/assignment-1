package JUnitex;

import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleTest {
	@Test
	public void testProduct() {
	// This block is executed for testing product method of Arithmetic class
	Arithmetic arithmetic = new Arithmetic();
	int number1 = 100;
	int number2 = 5;
	int actualvalue = arithmetic.product(number1, number2);
	int expectedvalue = 500;
	assertEquals(expectedvalue, actualvalue);
	}
	
}
