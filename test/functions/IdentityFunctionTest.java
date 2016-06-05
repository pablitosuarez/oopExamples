package functions;

import static org.junit.Assert.*;

import org.junit.Test;

import functions.interfaces.OOFunction;
import functions.unary.Identity;

public class IdentityFunctionTest {

	@Test
	public void testPositiveValue() {
		OOFunction anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				5, anIdentityFunction.evaluateWith(5), 0.001);
	}
	
	@Test
	public void testNegativeValue() {
		OOFunction anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				-15, anIdentityFunction.evaluateWith(-15), 0.001);
	}
	
	@Test
	public void testZeroValue() {
		OOFunction anIdentityFunction = new Identity();
		
		assertEquals("should return the same value sent", 
				0, anIdentityFunction.evaluateWith(0), 0.001);
	}

}
