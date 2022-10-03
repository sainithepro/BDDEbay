package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_steps {
	
	//WebDriver driver;
	EbayAdvancedSearch_Actions ebayadvancedsearch_actions;
	Common_Actions common_actions;
	
	public EbayAdvancedSearch_steps (EbayAdvancedSearch_Actions ebayadvancedsearch_actions, Common_Actions common_actions ) {
		this.common_actions = common_actions;
		this.ebayadvancedsearch_actions = ebayadvancedsearch_actions;
	}
	
	@Given("I am on Ebay Advanced Page")
	public void i_am_on_ebay_advanced_page() {
	    //driver.get("https://www.ebay.com/sch/ebayadvsearch");
		common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	}
	
	
	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() throws Exception {
		ebayadvancedsearch_actions.clickOnEbayLogo();
	    
	}
	@Then("I land on Ebay Home Page")
	public void i_land_on_ebay_home_page() {
	    String expectedUrl = "https://www.ebay.com/";
	    String actualUrl = 	common_actions.getCurrentUrl();
	    
	    if (expectedUrl.equals(actualUrl)) {
	    	System.out.println("We have landed on home page");
			
		}
	}
	
	@When("I advanced search an item") 
	public void i_advanced_search_an_item(DataTable dataTable) throws Exception {
//	    driver.findElement(By.id("_nkw")).sendKeys(dataTable.cell(1, 0));
//	    driver.findElement(By.id("_ex_kw")).sendKeys(dataTable.cell(1, 1));
//	    driver.findElement(By.xpath("//input[@title='Enter minimum price range value']")).sendKeys(dataTable.cell(1, 2));
//	    driver.findElement(By.xpath("//input[@title='Enter maximum price range value']")).sendKeys(dataTable.cell(1,3));
		
		ebayadvancedsearch_actions.enterSearchString(dataTable.cell(1, 0));
		ebayadvancedsearch_actions.enterExcludeString(dataTable.cell(1, 1));
		ebayadvancedsearch_actions.enterMinPrice(dataTable.cell(1, 2));
		ebayadvancedsearch_actions.enterMaxPrice(dataTable.cell(1,3));
	    
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
	    ebayadvancedsearch_actions.clickOnSearchBtn();
	}
	
	

}
