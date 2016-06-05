package functions.unary;

import functions.interfaces.OOFunction;

public class Constant implements OOFunction {
	
	private float value;
	
	public Constant (float aValue) {
		
		value = aValue;
	}
	
	public float evaluateWith(float aValue) {
		
		return value;
	}

}
