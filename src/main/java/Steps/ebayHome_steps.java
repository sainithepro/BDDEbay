package Steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebayHome_steps {

	//WebDriver driver;
	
	EbayHome_Actions ebayhome_actions;
	Common_Actions common_actions;

	public ebayHome_steps(EbayHome_Actions ebayhome_actions, Common_Actions common_actions) {
		this.common_actions = common_actions;
		this.ebayhome_actions = ebayhome_actions;
	}

	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
		// Write code here that turns the phrase above into concrete actions
		//driver.get("https://www.ebay.com");
		common_actions.goToUrl("https://www.ebay.com");
		System.out.println("I am at ebay home page");
	}

	@When("I click on Advaned Link")
	public void i_click_on_advaned_link() {
		//driver.findElement(By.id("gh-as-a")).click();
		ebayhome_actions.clickAdvanedLink();
		System.out.println("I have clicked the advance link");
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I navigate to Advaned Search page")
	public void i_navigate_to_advaned_search_page() {
		System.out.println(common_actions.getCurrentUrl());
		System.out.println("I am at new advance page");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I search for {string}")
	public void i_search_for_iphone(String str) {
//		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str);
//		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		ebayhome_actions.searchAnItem(str);
		ebayhome_actions.clickSearchBtn();
	}

	@Then("I validate atleast {int} search items present")
	public void i_validate_atleast_search_items_present(int count) {

		int resultNumber = ebayhome_actions.getSearchItemCount();
		// System.out.println(resultNumber);
		if (resultNumber >= count) {
			System.out.println("Results are greater then 1000, the search result shows :" + resultNumber + " results");
		}
	}

	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String str1, String str2) throws Exception {

		ebayhome_actions.selectCategory(str2);
		ebayhome_actions.searchAnItem(str1);
			
		}

//		Select select = new Select(driver.findElement(By.xpath("//select[@id = 'gh-cat']")));
//		select.selectByVisibleText(str2);


	@When("I click on {string}")
	public void i_click_on(String string) throws Exception {
	//driver.findElement(By.linkText(string)).click();
		ebayhome_actions.clickOnLinkByText(string);
	Thread.sleep(1000);
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		String actualUrl = common_actions.getCurrentUrl();
		String actualTitle = common_actions.getCurrentTitle();
		
//		if (!actualTitle.equals(title)) {
//			fail("Page title is correct");
//		}
		
		if (!actualUrl.equals(url)) {
			fail("Url is not correct");
			
		}
	}

}
