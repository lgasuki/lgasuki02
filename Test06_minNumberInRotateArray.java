package niuke_java;

public class Test06_minNumberInRotateArray {
	
	public int minNumberInRotateArray(int [] array) {
		int left = 0;
		int right = array.length - 1;
		int mid = left;
		
		if(array == null || array.length == 0) {
			return 0;
		}
		
		if(array[left] < array[right]) {
			return array[mid];
		}
		
		while(array[left] >= array[right]) {
			if(right - left == 0) {
				return array[0];
			}
			
			if(right - left == 1) {
				mid = right;
				break;
			}
			mid = (right + left)/2;
			if(array[mid] == array[left] && array[mid] == array[right]) {
				return findMin(array);
			}else if(array[mid] > array[left]) {
				left = mid;
			}else if(array[mid] <= array[right]){
				right = mid;
			}
		}
		return array[mid];
	}
	
	public int findMin(int [] array) {
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i-1])
				return array[i];
		}
		return array[0];
	}

}
