package string.opertion;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SplitAndJoinString {
	
	@Test
	public void testSplit() {
		String ourString = "apples, oranges, pears, pineapples";
		String[] fruits=ourString.split(",");
		assertEquals("apples", fruits[0]);
		assertEquals(" oranges", fruits[1]);
		assertEquals(4, fruits.length);
	}
	
	@Test
	public void testJoin() {
		String[] arrayFruits = new String[] {"apples", "oranges", "pears", "pineapples"};
		String singleLineString=String.join(", ", arrayFruits);
		assertEquals("apples, oranges, pears, pineapples", singleLineString);
		
	}

}
