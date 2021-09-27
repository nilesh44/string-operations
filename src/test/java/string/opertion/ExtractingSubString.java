package string.opertion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExtractingSubString {
	/*substring(int startIndex) returns a String containing all the characters from startIndex (inclusive) to the end of our String. It behaves the same as substring(int startIndex, ourString.length()).
	substring(int startIndex, int endIndex) returns a String containing all the characters from startIndex (inclusive) to endIndex (exclusive, i.e. the character at endIndex isn't returned)*/
	@Test
	public void testSubString() {
		String s= "AnilSing             9867665655anilsing56@gmail.com";
		String name=s.substring(0, 21);
		String phonenumber=s.substring(21,31);
		String email=s.substring(31);
		assertEquals("AnilSing             ", name);
		assertEquals("9867665655", phonenumber);
		assertEquals("anilsing56@gmail.com", email);
		
	}

}
