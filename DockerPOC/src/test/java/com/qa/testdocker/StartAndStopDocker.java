package com.qa.testdocker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StartAndStopDocker 
{
	@BeforeTest
	public void dockerStart() 
	{
		try 
		{
			Runtime.getRuntime().exec("cmd /c start docker_start.bat");
			Thread.sleep(15000);
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	@AfterTest
	public void dockerStop() 
	{
		try 
		{
			Runtime.getRuntime().exec("cmd /c start docker_stop.bat");
			Thread.sleep(15000);
			//Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
