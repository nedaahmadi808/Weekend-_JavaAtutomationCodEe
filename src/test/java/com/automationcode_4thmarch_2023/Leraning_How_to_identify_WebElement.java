package com.automationcode_4thmarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Leraning_How_to_identify_WebElement {
public WebDriver driver;
public ChromeOptions options;

@BeforeMethod
public void setup() {
	options=new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(options);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
 @Test
public void understandingWebElementsRedifflogin() {
driver.findElement(By.id("login1")).sendKeys("neda_ahmadi84@yahoo.com");
driver.findElement(By.id("password")).sendKeys("Neda1366$");
 driver.findElement(By.className("signinbtn")).click();
 
 
 
 }
}
 
