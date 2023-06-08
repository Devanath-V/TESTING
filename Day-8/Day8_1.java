package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
      WebDriver driver= new EdgeDriver();
      driver.get("https://demoqa.com/droppable/");
      driver.manage().window().maximize();
      WebElement a=driver.findElement(By.id("draggable"));
      WebElement b=driver.findElement(By.id("droppable"));
      Actions ac=new Actions(driver);
      ac.clickAndHold(a).release(b).build().perform();
      Thread.sleep(3000);
  }
}
