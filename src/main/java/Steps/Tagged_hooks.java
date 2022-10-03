package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_hooks {

	WebDriver driver;
	
	public Tagged_hooks(Common_Steps common_steps) {
		this.driver = common_steps.driver;
		
	}
	
	@Before( value = "@setCookies", order = 0)
	public void setCookies() {
		System.out.println("Scenario specific hook- setCOokies executed");
	}
	
	@After(value = "@Test", order = 0)
	public void testAfterHook() {
		System.out.println("This is scenario specific after hook");
	}
	
}
