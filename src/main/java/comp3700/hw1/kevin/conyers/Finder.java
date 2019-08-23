public class Finder {
	int findMax(int[] intArray) {
		int max = intArray[0];
		for (int a : intArray) {
			if (a > max) {
				max = a;
			}	
		}	
		return max;
	}
	int findMin(int[] intArray) {
		int min = intArray[0];
		for (int a : intArray) {
			if (a < min) {
				min = a;
			}
		}
		return min;
	}

}
