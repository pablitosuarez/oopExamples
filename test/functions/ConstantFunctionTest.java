package functions;

import static org.junit.Assert.*;

import org.junit.Test;

import functions.unary.Constant;

public class ConstantFunctionTest {

	@Test
	public void testSameVoluemeAsEvaluatedWith() {
		
		Constant aConstant = new Constant(5);
		
		assertEquals(5, aConstant.evaluateWith(5), 0.01);
		
	}
	
	@Test
	public void testEvaluateWithPositiveValue() {
		
		Constant aConstant = new Constant(3);
		
		assertEquals(3, aConstant.evaluateWith(10), 0.01);
		
	}
	
	@Test
	public void testEvaluateWithNegativeValue() {
		
		Constant aConstant = new Constant(7);
		
		assertEquals(7, aConstant.evaluateWith(-17), 0.01);
		
	}
	
	@Test
	public void tesEvaluateWithtZero() {
		
		Constant aConstant = new Constant(5);
		
		assertEquals(5, aConstant.evaluateWith(0), 0.01);
		
	}
	
	@Test
	public void testSetToNegativeValue() {
		
		Constant aConstant = new Constant(-5);
		
		assertEquals(-5, aConstant.evaluateWith(10), 0.01);
		
	}
	
	@Test
	public void testSetToZero() {
		
		Constant aConstant = new Constant(0);
		
		assertEquals(0, aConstant.evaluateWith(13), 0.01);
		
	}
	
	

}
