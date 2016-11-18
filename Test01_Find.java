package niuke_java;

public class Test01_Find {
	
	public boolean find(int a[][], int target){
		boolean found = false;
		
		if(a != null && a.length>0 && a[0].length > 0 ) {
			int row = 0;
			int col = a[0].length - 1;
			while(row < a.length && col >= 0) {
				if(a[row][col] == target) {
					found = true;
					return found;
				} else if(a[row][col] > target) {
					col--;
				} else {
					row++;
				}
			}
		}
		return found;
	}

}
