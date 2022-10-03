package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Steps.Common_Steps;
import elements.EbayHomePage_Elements;

public class EbayHome_Actions {
	
	private WebDriver driver;
	EbayHomePage_Elements ebayhomepage_elements;
	
	public EbayHome_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayhomepage_elements = new EbayHomePage_Elements(driver);
	}

	public void clickAdvanedLink() {
		ebayhomepage_elements.advancedLink.click();
	}
	
	public void searchAnItem(String srchString) {
		ebayhomepage_elements.searchString.sendKeys(srchString);
	}
	
	public void clickSearchBtn() {
		ebayhomepage_elements.searchBtn.click();
	}
	
	public int getSearchItemCount() {
		String s1 = ebayhomepage_elements.numOfItems.getText().trim();
		String s2 = s1.replaceAll(",", "");
		int itemCountInt = Integer.parseInt(s2);
		return itemCountInt;
		
	}
	
	public void selectCategory(String option) {

		List<WebElement> categories = ebayhomepage_elements.catOptions;

		for (WebElement x : categories) {
			if (x.getText().trim().toLowerCase().equals(option.toLowerCase())) {
				x.click();
				break;
			}
		}
	}
	
	public void clickOnLinkByText(String text) {
		driver.findElement(By.linkText(text)).click();
	}
}
