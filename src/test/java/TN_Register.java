import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Register {
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
	@Test 
	public void registerPage(){
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Neda");
		driver.findElement(By.id("input-lastname")).sendKeys("ahmadi");
		driver.findElement(By.id("input-email")).sendKeys("neda_ahmadi84@yahoo.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7038557734");
		driver.findElement(By.id("input-password")).sendKeys("Na0078182042$");
		driver.findElement(By.id("input-confirm")).sendKeys("Na0078182042$");
	    driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
		
		
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
		
		
}
