package com.tys.tests;

import org.testng.annotations.Test;
import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;
import com.tys.pages.OrderHistoryPage;

public class HomeTest extends BaseTest {

	@Test
	public void testValidLoginLogout() throws InterruptedException {
		HomePage home = new HomePage(driver);

		// Click on the login button
		home.ClickLogin();

		// enter the user name
		home.setUserName();

		// Enter the password
		home.setPassWord();

		// Click on Signin button
		home.ClickSignIn();

		// Verify Order history page is displayed
		OrderHistoryPage order = new OrderHistoryPage(driver);
		order.verifyTitle("Order History - My Account | BlueStone.com");

		// Click on LogedMenu
		order.clickLogedMenu();

		Thread.sleep(2000);

		// Click on signout
		order.clickSignOut();

	}

}
