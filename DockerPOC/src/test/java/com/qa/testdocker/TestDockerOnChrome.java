package com.qa.testdocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestDockerOnChrome 
{
	@Test
	public void getGoogleTitleOnChrome() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities chromeCapabilities=new DesiredCapabilities();
		chromeCapabilities.setBrowserName(BrowserType.CHROME);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"), chromeCapabilities);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
}
