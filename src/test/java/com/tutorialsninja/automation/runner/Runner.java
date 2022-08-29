package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:FeatureFiles/Registration.feature",
glue="classpath:com.tutorialsninja.automation.stepdef",
//plugin="html:target/cucumber_html_report",
tags="@Register"
)
public class Runner {

}
