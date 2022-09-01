package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeaderSection {
 public	HeaderSection() {
	 PageFactory.initElements(Base.driver, this);
 }
	
	@FindBy(linkText="My Account")
	public static WebElement MyAccount;
	
    @FindBy(linkText="Register")
	public static WebElement RegisterLink;
	
    @FindBy(linkText="Login")
    public static WebElement LoginLink;

    
}
