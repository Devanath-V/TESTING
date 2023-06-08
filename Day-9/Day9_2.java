package com.example.ice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_2 {
  @Test
  public void p() {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String actualTitle = driver.getTitle();
	  String  mytitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(mytitle,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"); 
	  String actualCurrentUrl = driver.getCurrentUrl();
	  String  myCurrentUrl="https://www.godaddy.com/en-in";
	  Assert.assertEquals(myCurrentUrl,"https://www.godaddy.com/en-in"); 
	  driver.close();
  }
	  
  		@SuppressWarnings("deprecation")
	  @Test
	  public void p1() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-34a91f05-db95-4219-88a6-44c008bb62c3\"]/nav/div[1]/ul/li[1]/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-34a91f05-db95-4219-88a6-44c008bb62c3\"]/nav/div[1]/ul/li[1]/ul/li[1]/a")).click();
  }
  		@SuppressWarnings("deprecation")
  		@Test
  		public void p2() {
  			WebDriverManager.edgedriver().setup();
  			WebDriver driver=new EdgeDriver();
  			driver.manage().window().maximize();
  			driver.get("https://www.godaddy.com/en-in");
  			driver.manage().window().maximize();
  			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
  			driver.findElement(By.xpath("//*[@id=\"id-34a91f05-db95-4219-88a6-44c008bb62c3\"]/nav/div[1]/ul/li[1]/span")).click();
  			driver.findElement(By.xpath("//*[@id=\"id-34a91f05-db95-4219-88a6-44c008bb62c3\"]/nav/div[1]/ul/li[1]/ul/li[1]/a")).click();
  			
  			
  			
  		}
}
