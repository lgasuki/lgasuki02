package niuke_java;

public class Test09_JumpFloorII {
	public int JumpFloorII(int target) {
		int m = 0;
		if(target <= 0){
			return m;
		}
		if(target == 1) {
			return m = 1;
		}
		
		return 2*JumpFloorII(target - 1);
		
	}

}
