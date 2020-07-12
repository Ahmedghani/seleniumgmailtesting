package com.appium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class testingappfirst {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws MalformedURLException {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("BROWSER_NAME", "Android");
				capabilities.setCapability("VERSION", "8.0.0"); 
				capabilities.setCapability("deviceName","Emulator");
				capabilities.setCapability("platformName","Android");
			 
			   
			   capabilities.setCapability("appPackage", "com.android.calculator2");
			// This package name of your app (you can get it from apk info app)
				capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
			//Create RemoteWebDriver instance and connect to the Appium server
			 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
			   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

}
