package niuke_java;

public class Test10_RectCover {
	public int RectCover(int target) {
		if(target <= 0) {
			return 0;
		}
		if(target == 1 || target == 2) {
			return target;
		}
		int f1 = 1;
		int f2 = 2;
		int f = 0;
		for(int i = 3; i <= target; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}

}
