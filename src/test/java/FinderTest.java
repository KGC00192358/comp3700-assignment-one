import org.junit.*;

public class FinderTest {
	Finder testFinder = new Finder();
	int[] cleanArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] nullArray = null;
	int[] emptyArray = {};
	
	@Test
	public void maxTestCleanArray() {
		Assert.assertEquals(10, testFinder.findMax(cleanArray));
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void maxTestNullArray() {
		testFinder.findMax(nullArray);
	}
	
	@Test (expected = java.lang.IndexOutOfBoundsException.class)
	public void maxTestEmptyArray() {
		testFinder.findMax(emptyArray);
	}
	@Test
	public void minTestCleanArray() {
		Assert.assertEquals(1, testFinder.findMin(cleanArray));
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void minTestNullArray() {
		testFinder.findMin(nullArray);
	}
	
	@Test (expected = java.lang.IndexOutOfBoundsException.class)
	public void minTestEmptyArray() {
		testFinder.findMin(emptyArray);
	}

}
