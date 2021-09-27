package string.opertion;

import static org.junit.Assert.fail;

import org.junit.Test;

public class StringConstantPoolTest {

	@Test
	public void verifyStringLiteralStoreInSCP() {

		// object created with literal is always stored in SCP
		// in SCP if same content is alrady present then jvm do not create new object it
		// simply pass , reference of already existing object
		String s1 = "World";
		String s2 = "World";
		String s3 = "hello";

		// object created with new keyword always created with new physical address
		String s4 = new String("World");
		String s5 = new String("World");

		// double equal == always compare physical address of the object
		
		// this shows that s1 and s2 literal have same content thats why they have same
		// physical address in SCP
		if (!(s1 == s2)) {
			fail();
		}

		// this shows that s1 and s4 does not have same content they have they did not
		// have same physical address in SCP
		if ((s1 == s3)) {
			fail();
		}

		// this shows that s1 and s4 have same content but they did not have same
		// physical address
		if (s1 == s4) {
			fail();
		}

		// this shows that s4 and s5 have same content but they did not have same
		// physical address
		if (s4 == s5) {
			fail();
		}
	}

}
