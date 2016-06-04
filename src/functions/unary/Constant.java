package functions.unary;

public class Constant {
	
	private float value;
	
	public Constant (float aValue) {
		
		value = aValue;
	}
	
	public float evaluateWith(float aValue) {
		
		return value;
	}

}
