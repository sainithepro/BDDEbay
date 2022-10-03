package actions;

import org.openqa.selenium.WebDriver;

import Steps.Common_Steps;

public class Common_Actions {

	WebDriver driver;

	public Common_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}

	public void goToUrl(String str) {
		driver.get(str);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void quitDriver() {
		driver.quit();
	}

}
