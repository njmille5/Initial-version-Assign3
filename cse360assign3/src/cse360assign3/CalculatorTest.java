package cse360assign3;
/**
 * @author Nicholas Miller
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator cTest = new Calculator();
		assertNotNull(cTest);
	}

	@Test
	public void testGetTotal() {
		Calculator cTest = new Calculator();
		assertEquals(cTest.getTotal(), 0);
		cTest.add(5);
		assertEquals(cTest.getTotal(), 5);
	}

	@Test
	public void testAdd() {
		Calculator cTest = new Calculator();
		cTest.add(5);
		assertEquals(cTest.getTotal(), 5);
		cTest.add(0);
		assertEquals(cTest.getTotal(), 5);
		cTest.add(-1);
		assertEquals(cTest.getTotal(), 4);
	}

	@Test
	public void testSubtract() {
		Calculator cTest = new Calculator();
		cTest.subtract(5);
		assertEquals(cTest.getTotal(), -5);
		cTest.subtract(0);
		assertEquals(cTest.getTotal(), -5);
		cTest.subtract(-1);
		assertEquals(cTest.getTotal(), -4);
	}

	@Test
	public void testMultiply() {
		Calculator cTest = new Calculator();
		cTest.multiply(5);
		assertEquals(cTest.getTotal(), 0);
		cTest.add(1);
		cTest.multiply(88);
		assertEquals(cTest.getTotal(), 88);
		cTest.multiply(0);
		assertEquals(cTest.getTotal(), 0);
	}

	@Test
	public void testDivide() {
		Calculator cTest = new Calculator();
		cTest.divide(5);
		assertEquals(cTest.getTotal(), 0);
		cTest.add(144);
		cTest.divide(12);
		assertEquals(cTest.getTotal(), 12);
	}
	
	@Test
	public void testDivideByZero() {
		Calculator cTest = new Calculator();
		cTest.add(144);
		cTest.divide(0);
		assertEquals(cTest.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator cTest = new Calculator();
		cTest.divide(5);
		cTest.add(144);
		cTest.multiply(12);
		cTest.subtract(22);
		assertEquals(cTest.getHistory(), "0 / 5 + 144 * 12 - 22");
	}
	

}
