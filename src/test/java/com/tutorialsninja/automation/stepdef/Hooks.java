package com.tutorialsninja.automation.stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;


import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
private static Logger log = Logger.getLogger(Hooks.class);
	
	@Before
	public void setUp(Scenario scenario){
		InputStream input1 = null;
		try {
			input1 = new FileInputStream("D:\\GitHubRepos\\DemoLiveProject\\src\\main\\resources\\ConfigurationFile\\log4j.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		PropertyConfigurator.configure(input1);
		//PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		log.info("Scenario Started: "+scenario.getName());
		Base.reader=new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
	}
	//@After
	public void closeBrowser(Scenario scenario){
	/*if(scenario.isFailed()){
	//scenario.embed(Browser.takeScreenshot(), "image/png");
		scenario.attach(Browser.takeScreenshot(), "image/png", null);
	}
	log.info("Scenario Completed: "+scenario.getName());
	log.info("Scenario Status is: "+scenario.getStatus());*/
	Base.driver.quit();
	}

}
