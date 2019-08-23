public class Finder {
	int findMax(int[] intArray) throws NullPointerException {
		int max = 0;
		try {
			max = intArray[0];
		} catch (java.lang.NullPointerException e) {
			throw new java.lang.NullPointerException();
		} catch (java.lang.IndexOutOfBoundsException e) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		for (int a : intArray) {
			if (a > max) {
				max = a;
			}	
		}	
		return max;
	}
	int findMin(int[] intArray) {
		int min = 0;
		try {
			min = intArray[0];
		} catch (java.lang.NullPointerException e) {
			throw new java.lang.NullPointerException();
		} catch (java.lang.IndexOutOfBoundsException e) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		for (int a : intArray) {
			if (a < min) {
				min = a;
			}
		}
		return min;
	}

}
