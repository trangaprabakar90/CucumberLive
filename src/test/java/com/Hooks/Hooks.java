package com.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	 static String Browser="Chrome";
	 public static WebDriver driver;
	 static  String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Before
	 public void BrowserLaunch() {
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Launching Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else if (Browser.equalsIgnoreCase("Firefox")) 
		{
			System.out.println("Launching FireFox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			System.out.println("Launching Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
		else {
			System.out.println(Browser+"-Mentioned Invalid Browser");
		}		
		
	}
	
	/*
	 * @After public void CloseBrowser() { driver.quit(); }
	 */
}
