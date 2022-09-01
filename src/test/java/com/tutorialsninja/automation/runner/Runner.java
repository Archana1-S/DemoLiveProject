package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:FeatureFiles/login.feature",
glue="classpath:com.tutorialsninja.automation.stepdef",
//plugin="html:target/cucumber_html_report",
tags="@Login"
)
public class Runner {

}
