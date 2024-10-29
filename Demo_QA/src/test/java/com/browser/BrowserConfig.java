package com.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserConfig {
	WebDriver driver=null;
	public WebDriver BrowserSelection(String browser,String URL) throws InterruptedException
	{
		if(browser.equals("chrome") || browser.equals("Chrome") || browser.equals("CHROME"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			JavascriptExecutor zoomout = (JavascriptExecutor) driver;
			zoomout.executeScript("document.body.style.zoom='50%'");
		}
		else if (browser.equals("edge") || browser.equals("Edge") || browser.equals("EDGE")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			JavascriptExecutor zoomout = (JavascriptExecutor) driver;
			zoomout.executeScript("document.body.style.zoom='50%'");
		}
		else {
			System.out.println("No Browser Selected");
		}
		return driver;
	}
}