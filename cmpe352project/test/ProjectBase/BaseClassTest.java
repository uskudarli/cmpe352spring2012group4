package ProjectBase;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseClassTest {

	@Test
	public void testTestEmail() {
		assertTrue(BaseClass.testEmail("aa@aa.com"));
	}

}
