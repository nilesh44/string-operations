package string.opertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class FindingIndexOfCharacterAndSubString {

	// indexOf
	// lastIndexOf

	/*
	 * this internally calls caharAt method from index 0 to last index until it
	 * finds matched character or subString it effect on performance if string size
	 * is large and substring or character we are searching is present in middle of
	 * string if string is short then it won't effect much on performance
	 */
	
	@Test
	public void characteOrSubstringNotPresent() {
		String s = "0123456789012345678901234567890";

		// if passed argument char or substring is not present in given String then it
		// return -1
		assertEquals(-1, s.indexOf('a'));
		assertEquals(-1, s.indexOf("15"));
		assertEquals(-1, s.lastIndexOf('a'));
		assertEquals(-1, s.lastIndexOf("15"));
	}

	@Test
	public void findIndexOfCharacter() {
		String s = "0123456789012345678901234567890";

		// index of provide the index of first occurance
		assertEquals(5, s.indexOf('5'));
		assertNotEquals(15, s.indexOf('5'));

		// this index of provide the index of first occurance after 14th index
		assertEquals(15, s.indexOf('5', 14));
	}

	@Test
	public void findIndexOfSubString() {
		String s = "01 23 45 67 89 01 23 45 67 89 01 23 45 67 89 0";

		// returns the (first) starting position of substring in the String
		assertEquals(6, s.indexOf("45"));
		assertNotEquals(15, s.indexOf("45"));

		// returns the (first) starting position of substring in the String after 14th
		assertEquals(21, s.indexOf("45", 20));
	}

	@Test
	public void findLastIndexOfCharacter() {
		String s = "0123456789012345678901234567890";

		// lastIndexOf of provide the index of first occurrence when we look from
		// backward
		assertEquals(25, s.lastIndexOf('5'));
		assertNotEquals(15, s.lastIndexOf('5'));

		// this lastIndexOf of provide the index of first occurance after 14th index
		// ,when we look from backward
		assertEquals(5, s.lastIndexOf('5', 14));
	}

	@Test
	public void findLastIndexOfSubString() {
		String s = "01 23 45 67 89 01 23 45 67";

		// returns the (first) starting position of substring in the Stringwhen we look
		// from backward
		assertEquals(21, s.lastIndexOf("45"));
		assertNotEquals(15, s.lastIndexOf("45"));

		// returns the (first) starting position of substring in the String after 14th
		// ,when we look from backward
		assertEquals(6, s.lastIndexOf("45", 20));
	}
}
