package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage_Elements {
	
	WebDriver driver;

	@FindBy(id = "gh-as-a")
	public WebElement advancedLink;
	@FindBy(xpath = "//input[@id='gh-ac']")
	public WebElement searchString;
	@FindBy(xpath = "//input[@id='gh-btn']")
	public WebElement searchBtn;
	@FindBy(xpath = "//h1[@class='srp-controls__count-heading']//span[1]")
	public WebElement numOfItems;
	@FindBy(xpath = "//select[@id = 'gh-cat']")
	public List<WebElement> catOptions;
	
	public EbayHomePage_Elements(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
