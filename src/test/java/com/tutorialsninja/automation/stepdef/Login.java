package com.tutorialsninja.automation.stepdef;

import org.testng.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import io.cucumber.java.en.*;

public class Login {
	
	HeaderSection headersection= new HeaderSection();
	LoginPage loginpage=new LoginPage();
	AccountPage accountpage = new AccountPage();

	@And("I navigate to Login Page")
	public void i_navigate_to_login_page() {
	   Elements.click(HeaderSection.MyAccount);
	   Elements.click(HeaderSection.LoginLink);
	}
	
	
/*	@When("^I enter Username \"([^\"]*)\" and password \"([^\"]*)\" into the fields$")
	public void i_enter_username_and_password_into_the_fields(String username, String password) {

	    Elements.TypeTextIfElementPresent(LoginPage.EmailAdressInputfield,username);
	    Elements.TypeText(LoginPage.PasswordInputfield, password);
	
	}*/

	@When("I enter Username and password into the fields")
	public void i_enter_username_and_password_into_the_fields() {
	    Elements.TypeText(LoginPage.EmailAdressInputfield, Base.reader.getusername());
	    Elements.TypeText(LoginPage.PasswordInputfield, Base.reader.getpassword());
	}


	
	
	@And("I click on Login button")
	public void i_click_on_login_button() {
		Elements.click(LoginPage.LoginButton);
	}
	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountPage.RegAffliateLink));
	}
	
}
