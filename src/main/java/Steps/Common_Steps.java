package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Steps {
	
	public static WebDriver driver;
	
	
	@Before(order = 1)			// order is important
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("opening browser");
	}

	
	@After(order = 1)
	public void tearDown()throws Exception {
		driver.quit();
		System.out.println("THis is global after hook");
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
