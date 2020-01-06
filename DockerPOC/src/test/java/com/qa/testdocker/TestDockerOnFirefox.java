package com.qa.testdocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestDockerOnFirefox 
{
	@Test
	public void getGoogleTitleOnFirefox() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities fireFoxCapabilities=new DesiredCapabilities();
		fireFoxCapabilities.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), fireFoxCapabilities);
		driver.get("https://www.yahoo.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
