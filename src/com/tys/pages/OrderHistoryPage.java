package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;
import com.tys.generics.UtilityLib;

public class OrderHistoryPage extends BasePage {

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.loggedin")
	private WebElement logedMenu;

	@FindBy(id = "bst-sign-out")
	private WebElement signoutBTN;

	public void clickLogedMenu() {

		UtilityLib.moveToElement(driver, logedMenu);
	}

	public void clickSignOut() {
		signoutBTN.click();
	}

}
