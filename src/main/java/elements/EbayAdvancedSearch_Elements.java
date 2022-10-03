package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {
	
	WebDriver driver;

	@FindBy(xpath = "//a[@id = 'gh-la']")
	public WebElement ebayLogo;
	@FindBy(id = "_nkw")
	public WebElement searchString;
	@FindBy(id = "_ex_kw")
	public WebElement excludeString;
	@FindBy(xpath = "//input[@title='Enter minimum price range value']")
	public WebElement minPrice;
	@FindBy(xpath = "//input[@title='Enter maximum price range value']")
	public WebElement maxPrice;
	@FindBy(xpath = "//button[@id='searchBtnLowerLnk']")
	public WebElement srchBtn;
	
	
	public EbayAdvancedSearch_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
