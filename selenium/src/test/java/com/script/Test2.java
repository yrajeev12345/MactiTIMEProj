package com.script;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Test2 extends Test1 {
  @Test
  public void Search1() {
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
			 
   }
  
  
}

  
  