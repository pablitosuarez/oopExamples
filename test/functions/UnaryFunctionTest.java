package functions;

import static org.junit.Assert.*;

import org.junit.Test;

import functions.unary.Identity;

public class UnaryFunctionTest {

	@Test
	public void testPositiveValue() {
		Identity anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				5, anIdentityFunction.evaluateWith(5), 0.001);
	}
	
	@Test
	public void testNegativeValue() {
		Identity anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				-15, anIdentityFunction.evaluateWith(-15), 0.001);
	}
	
	@Test
	public void testZeroValue() {
		Identity anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				0, anIdentityFunction.evaluateWith(0), 0.001);
	}

}
