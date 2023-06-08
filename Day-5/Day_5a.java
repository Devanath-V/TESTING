package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day_5a {

	public static void main(String args[]) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://j2store.net/free/");
    driver.manage().window().maximize();
    String actualtitle=driver.getTitle();
    String Title="Home";
    if(actualtitle.equals(Title))
    {
    	System.out.println("yes, true");
    }
    else
    System.out.println("Nope, false");
    
    Thread.sleep(0);
    JavascriptExecutor js =(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)", "");
    driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
    String thetitle=driver.getTitle();
    String secondtitle="Shop";
    if(thetitle.equals(secondtitle))
    {
    	System.out.println("Yes");
    }
    else
    System.out.println("No");
    
}
}
