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

}
