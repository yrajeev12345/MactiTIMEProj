package com.script;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {
	public WebDriver driver;
	@Parameters("sBrowser")
  @BeforeMethod
   public void TestLaunch(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	   driver=new FirefoxDriver();
		}else if(sBrowser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
        }
		@AfterMethod
		public void closeBrowser(){
			
			driver.quit();
		
	}
}



  


