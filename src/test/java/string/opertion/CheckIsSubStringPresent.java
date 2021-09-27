package string.opertion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIsSubStringPresent {

	@Test
	public void checkForSubString() {
		String s = "this is a very big string.";

		assertTrue(s.contains("very"));
		assertTrue(s.startsWith("t"));
		assertTrue(s.endsWith("."));
		assertTrue(s.matches(".*big.*"));

		assertFalse(s.contains("one"));
		assertFalse(s.startsWith("j"));
		assertFalse(s.endsWith(":"));
		assertFalse(s.matches(".*second.*"));

	}
}
