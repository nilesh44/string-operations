package string.opertion;

import static org.junit.Assert.fail;

import org.junit.Test;

public class StringMethodInternTest {
	
	//When we called an intern method of any string object 
	//JVM search in SCP if object with same content is present in SCP then jvm, return the reference of that object 
	//If object with same content is not present with same content then it will create new object in SCP and then return reference of that object
	@Test
	public void internTest() {
		 String s1="world";
		 
		 String s2= new String("world");
		 
		 String s3=s2.intern();
		 
		 //this shows that s1 and s3 have same physical address
		 if(!(s1==s3)) {
			 fail();
		 }
	}

}
