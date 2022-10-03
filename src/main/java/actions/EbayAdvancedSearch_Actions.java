package actions;

import org.openqa.selenium.WebDriver;

import Steps.Common_Steps;
import elements.EbayAdvancedSearch_Elements;

public class EbayAdvancedSearch_Actions {
	
	WebDriver driver;
	EbayAdvancedSearch_Elements ebayadvancedsearch_elements;
	
	public EbayAdvancedSearch_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayadvancedsearch_elements = new EbayAdvancedSearch_Elements(driver);
	}
	
	public void clickOnEbayLogo() {
		ebayadvancedsearch_elements.ebayLogo.click();
	}
	
	public void enterSearchString(String str) {
		ebayadvancedsearch_elements.searchString.sendKeys(str);
	}
	
	public void enterExcludeString(String str) {
		ebayadvancedsearch_elements.excludeString.sendKeys(str);
	}
	
	public void enterMinPrice(String str) {
		ebayadvancedsearch_elements.minPrice.sendKeys(str);
	}
	
	public void enterMaxPrice(String str) {
		ebayadvancedsearch_elements.maxPrice.sendKeys(str);
	}
	
	public void clickOnSearchBtn() {
		ebayadvancedsearch_elements.srchBtn.click();
	}

}
