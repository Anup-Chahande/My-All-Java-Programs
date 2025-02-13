package Suite;

import org.junit.Assert;
import org.junit.Test;


public class Case1 {
	@Test
	public void testadd() {
		
		Assert.assertEquals(4,Add.add(2, 2));
		
	}

}
