package com.javacode_11thmarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		if (browserName.equals("Chrome")){
	     WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:// www.amazon.com");
	    driver.quit();
	   }else if (browserName.equals("Firfox")) {
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.wegman.com");
		   driver.quit();   
	   }else if (browserName.equals("Edge")) {
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.walmart.com");
		  driver.quit();
	   }else {
		   System.out.println("nothing opened");
	   }
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		  driver.quit();
		
		

	}

}
