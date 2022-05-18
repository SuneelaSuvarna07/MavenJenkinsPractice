package p1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void createSession() {
		System.out.println("Appium Driver Started");
		Assert.fail();
	}

	@Test
	public void testMobileLogin() {
		System.out.println("Logged into mobile app");
	}

	@Test
	public void testMobileLogout() {
		System.out.println("Logged out from mobile app");
	}

}
