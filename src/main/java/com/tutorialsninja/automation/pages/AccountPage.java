package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class AccountPage {
	public AccountPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(linkText="Register for an affiliate account")
	public static WebElement RegAffliateLink;
	
}
