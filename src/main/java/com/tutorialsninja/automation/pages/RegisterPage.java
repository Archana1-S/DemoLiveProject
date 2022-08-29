package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import io.cucumber.datatable.DataTable;

public class RegisterPage {
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[id=\"input-firstname\"]+div")
	public static WebElement FirstNameWarningMsg;
	
	@FindBy(css="input[id=\"input-lastname\"]+div")
	public static WebElement LastNameWarningMsg;
	
	@FindBy(css="input[id=\"input-email\"]+div")
	public static WebElement EmailWarningMsg;
	
	@FindBy(css="input[id=\"input-telephone\"]+div")
	public static WebElement TelephoneWarningMsg;
	
	@FindBy(css="input[id=\"input-password\"]+div")
	public static WebElement passwordWarningMsg;
	
	@FindBy(css="div[class $=\"alert-dismissible\"]")
	public static WebElement MainWarningMsg;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement ContinueBtn;
	
	public void fillRegistrationDetails(DataTable dataTable) {
		 Map<String,String> map= dataTable.asMap(String.class, String.class);
	        Elements.TypeText(RegisterPage.firstName, map.get("first name"));
	        Elements.TypeText(RegisterPage.lastName, map.get("last name"));
	        Elements.TypeText(RegisterPage.Email, System.currentTimeMillis()+map.get("email"));
	        Elements.TypeText(RegisterPage.telephone, map.get("telephone"));
	        Elements.TypeText(RegisterPage.password, map.get("password"));
	        Elements.TypeText(RegisterPage.confirmPassword, map.get("password"));
	}
	
}
