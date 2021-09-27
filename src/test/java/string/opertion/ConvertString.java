package string.opertion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertString {

	@Test
	public void ConvertArrayOfStringToSingleLineString() {
		String[] array= new String[] {"what","is","this"};
		
		//java 8
		String oneLine=String.join(" ", array);
		
		assertEquals("what is this", oneLine);
		
	}
}
