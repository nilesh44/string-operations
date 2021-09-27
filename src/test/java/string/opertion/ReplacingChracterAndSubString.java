package string.opertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReplacingChracterAndSubString {

	@Test
	public void replaceOneCharacter() {
		String s = "this is a very big string.";

		String modified=s.replace("t", "R");
		assertEquals("Rhis is a very big sRring.", modified);
	}
	
	@Test
	public void replaceWholeSubString() {
		String s = "this is a very big string.";

		String modified=s.replace("very", "small");
		assertEquals("this is a small big string.", modified);
	}
}
