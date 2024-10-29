package com.mvn;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.browser.BrowserConfig;


public class MainTest {
	WebDriver driver=null;
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException{	
		System.out.println("Hello");
		driver=new BrowserConfig().BrowserSelection("edge", "https://demoqa.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void test1() {
		System.out.println("Test Block");
	}
	@AfterClass
	public void quitBrowser(){
		if (driver!=null) {
			driver.quit();
			System.out.println("Test Completed");
		} else {
			System.out.println("No valid browser selected. So system can't perform quit Operation");
		}
	}
}