package niuke_java;

public class Test12_Power {
	public double Power(double base, int exponent) {
		boolean g_InvalidInput = false;
		if(equal(base, 0.0) && exponent < 0) {
			g_InvalidInput = true;
			return 0.0;
		}
		
		int absExponent = exponent; 
		if(exponent < 0) {
			absExponent = (-exponent);
		}
		
		double result = powerWithUnsignedExponent(base, absExponent);
		if(exponent < 0) {
			result = 1.0 / result;
		}
		return result;
	}
	
	double powerWithUnsignedExponent(double base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}
		double result = powerWithUnsignedExponent(base, exponent>>1);
		result *= result;
		if((exponent & 0x1) == 1)
			result *= base;
		return result;
	}

	
	boolean equal(double num1, double num2) {
		if((num1 - num2) > -0.0000001 && (num1 - num2) < 0.0000001)
			return true;
		else 
			return false;
	}

}
