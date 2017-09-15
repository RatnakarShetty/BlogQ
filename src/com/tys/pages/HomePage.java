package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='login']")
	private WebElement loginBTN;

	@FindBy(xpath = "//input[@id='email-id']")
	private WebElement emailIDF;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordF;

	@FindBy(xpath = "//input[@id='edit-login-account']")
	private WebElement signInBtn;

	public void ClickLogin() {
		loginBTN.click();
	}

	public void setUserName() {
		emailIDF.sendKeys("ratnakarsgb21@gmail.com");
	}

	public void setPassWord() {
		passwordF.sendKeys("$ganesh21$");
	}

	public void ClickSignIn() {
		signInBtn.click();
	}

}
