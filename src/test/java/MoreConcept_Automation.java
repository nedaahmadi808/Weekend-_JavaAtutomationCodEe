import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreConcept_Automation {
public static WebDriver driver;
public static ChromeOptions options;

@BeforeMethod
public void OpenBrowser() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(options);
	driver.get("https://rediff.com");
}
@Test
public void ClickOnSigninLink() {
	driver.findElement(By.className("signin")).click();
}
@Test
public void LoginCredentials() {
	driver.findElement(By.className("signin")).click;
	driver.findElement(By.id("Login1")).sendKeys("neda_Ahmadi84@yahoo.com");
	driver.findElement(By.id("password")).sendKeys("Na0078182042$");
	driver.findElement(By.className("signinbtn")).click();

}
@Test
public void clickOnlogoutLink() {
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("Login1")).sendKeys("neda_Ahmadi84@yahoo.com");
	driver.findElement(By.id("password")).sendKeys("Na0078182042$");
	driver.findElement(By.className("signinbtn")).click();	
	driver.findElement(By.className("rd-logout")).click();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}




}
