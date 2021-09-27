package string.opertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class RemovingLeadingAndTrailingWhiteSpace {
	//Eliminates Leading and Trailing whiteSpaces
	@Test
	public void testTrim() {
		String s= "    world    ";
		s=s.trim();
		assertEquals(5, s.length());
		assertEquals("world", s);
		assertNotEquals("    world    ", s);
	}

}
