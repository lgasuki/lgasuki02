package niuke_java;

public class Test08_Step {
	public int JumpFloor(int target) {
		int f0 = 1;
		int f1 = 1;
		int f = 0 ;
		if(target <= 0) {
			return f;
		} else if(target == 1){
			return f0;
		} else {
			for(int i = 2; i <= target; i++) {
				f = f0 + f1;
				f0 = f1;
				f1 = f;
			}
		}
		return f;
	}

}
