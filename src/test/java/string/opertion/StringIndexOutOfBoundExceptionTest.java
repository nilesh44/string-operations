package string.opertion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringIndexOutOfBoundExceptionTest {
	
    // we get StringIndexOutOfBoundException when we tryed to perform 
	// operation for index which is not present in String

	// [0][1][2][3][4][5]
	// [G][i][t][h][u][b]
	// first index is always 0.
	// last index= size-1
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void whenPositiveIndexIsNotPresent() {

		String s = "GitHub";
		s.charAt(6);

	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void whenPassedIndexdIsNegative() {

		String s = "GitHub";
		s.charAt(-1);
	}

	@Test
	public void whenPositiveIndexIsPresent() {

		String s = "GitHub";
		assertEquals('G', s.charAt(0));
		assertEquals('b', s.charAt(5));

	}
}
