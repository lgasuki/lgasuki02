package niuke_java;

public class Test07_Fibonacci {
	public int fibonacci(int n) {
		int [] result = {0, 1};
		int Nm1 = 1;
		int Nm2 = 0;
		int fibN = 0;
		if(n < 2) {
			return result[n];
		}
		for(int i = 2; i <= n; i++) {
			fibN = Nm1 + Nm2;
			Nm2 = Nm1;
			Nm1 = fibN;
		}
		return fibN;
	}

}
