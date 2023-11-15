import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreConceptAutomationNinja {
public static WebDriver driver;
public static ChromeOptions options;

@BeforeMethod
public void OpenBrowser() {
options = new ChromeOptions();
options.setPageLoadStrategy(PageLoadStrategy.EAGER);
options.addArguments("--start-maximized");
options.addArguments("--remote-allow-origins=*");
driver=new ChromeDriver(options);
driver.get("https://www.tutorialsninja.com/demo");
}
@Test(priority=1)
public void clickOnMyAccountLink() {
	driver.findElement(By.linkText("My Account")).click();
}
@Test(priority=2)
public void ClickOnLogInLink() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
}
@Test (priority=3)
public void enterLogInCredentials() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("neda_ahmadi84@yahoo.com");
	driver.findElement(By.id("input-password")).sendKeys("Na0078182042$");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
@Test(priority=4)
public void cliclOnLogOutLink() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("neda_ahmadi84@yahoo.com");
	driver.findElement(By.id("input-password")).sendKeys("Na0078182042$");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	driver.findElement(By.linkText("Logout")).click();
	
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}



