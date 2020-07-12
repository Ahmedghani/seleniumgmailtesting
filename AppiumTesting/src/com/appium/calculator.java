package com.appium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import okhttp3.internal.platform.Platform;

class calculator {
 
	 
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	 
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
	void test() throws MalformedURLException {
		 DesiredCapabilities	cap=new DesiredCapabilities();
		  cap.setCapability("deviceName", "my devices");
		  cap.setCapability("udid", "26EBB18705162579");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "8.0.0");
		  cap.setCapability("appPackage", "com.google.android.calculator");
		  cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		  
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //driver.findElement(By.id("")).click();
		  //MobileElement elementOne = (MobileElement) driver.findElementByAccessibilityId(By.id(""));
		  MobileElement ele9=(MobileElement) (driver.findElement(By.id("com.google.android.calculator:id/digit_9")));
		  ele9.click();
		  MobileElement eleadd=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		  eleadd.click();
		  
		  MobileElement ele3=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_3")) ;
		  ele3.click();
		  MobileElement eq=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/eq")) ;
		  eq.click();
		  
		  
	}
	
	//void testelelment() throws MalformedURLException{
		/*// Create object of  DesiredCapabilities class and specify android platform
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		 capabilities.setCapability("no",true);
		 
		// set the capability to execute test in chrome browser
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		 
		// set the capability to execute our test in Android Platform
		  // capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.Android);
		 
		// we need to define platform name
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 
		// Set the device name as well (you can give any name)
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");
		 
		 // set the android version as well 
		   capabilities.setCapability(MobileCapabilityType.VERSION,"8.0.0");
		 
		 // Create object of URL class and specify the appium server address
		 URL url= new URL("http://0.0.0.0:4723/wd/hub");
		 
		// Create object of  AndroidDriver class and pass the url and capability that we created
		 WebDriver driver = new AndroidDriver(url, capabilities);
		 
		// Open url
		  driver.get("http://www.facebook.com");
		 
		 // print the title
		  System.out.println("Title "+driver.getTitle());*/
	//}

}
