import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Nilesh Professional World\\My Practice\\JenkinsUITest\\src\\main\\resources\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 1 title is: "+driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	
	/*
	 * @Test public void Test3() { driver.navigate().to("https://www.google.com/");
	 * System.out.println("Test 3 title is "+driver.getTitle());
	 * AssertJUnit.assertEquals("Expected title", driver.getTitle()); }
	 */
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
