package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;



public class Registration {
	HeaderSection headersection= new HeaderSection();
	RegisterPage registerpage=new RegisterPage();
	AccountSuccessPage accountsuccesspage=new AccountSuccessPage();
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable  {
   Base.driver.get(Base.reader.getUrl());
  
	}

	@And("^I navigate to Registration page$")
	public void i_navigate_to_Registration_page()  {
		Elements.clickOnlyIfElementPresent(HeaderSection.MyAccount);

	//	Elements.click(HeaderSection.MyAccount);
		Elements.click(HeaderSection.RegisterLink);

	}

	@When("^I fill the bellow valide details$")
	public void i_fill_the_bellow_valide_details(DataTable dataTable)  {
		
		       registerpage.fillRegistrationDetails(dataTable);
		        
	   
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	   Elements.click(RegisterPage.privacyPolicy);
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button()  {
	   Elements.click(RegisterPage.ContinueBtn);
	}

	@SuppressWarnings("static-access")
	@Then("^I should see that user account has successfully created$")
	public void i_should_see_that_user_account_has_successfully_created()  {
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.SuccesLink));
	}



}
