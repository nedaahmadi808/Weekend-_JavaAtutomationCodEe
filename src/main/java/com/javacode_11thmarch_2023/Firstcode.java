package com.javacode_11thmarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Firstcode {
public static  WebDriver driver;
public static ChromeOptions options;

	public static void main(String[] args) {
   
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.findElement(By.linkText("signin"));
		
		
		
				
	}

}
