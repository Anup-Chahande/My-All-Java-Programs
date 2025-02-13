package Junit;

import org.junit.Assert;
import org.junit.Test;


public class Testclass {

	@Test
	public void testanymethod(){
		Anyclass a = new Anyclass();
       Assert.assertEquals(13, a.addition());
	
	}
	
	@Test
	public void testanymethod2(){
		Abyclass2 a = new Abyclass2();
       Assert.assertEquals(1, a.sub());
	
	}
	
	
}
