package com.tutorialsninja.automation.config;


import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			InputStream input= new FileInputStream("D:\\GitHubRepos\\DemoLiveProject\\src\\main\\resources\\ConfigurationFile\\config.properties");
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}
	
	public String getusername() {
		return properties.getProperty("username");
	}
	public String getpassword() {
		return properties.getProperty("password");
	}
	
	}
