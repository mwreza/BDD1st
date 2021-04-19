package step_defination;



import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;

import base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;

public class HomePageLinkFunctionaltyTest extends TestBase {
	HomePage hm;
		
	public HomePageLinkFunctionaltyTest() throws IOException {
		super();
		hm = new HomePage();
	}

		
	@Given("^user is already in homePage$")
	public void user_is_already_in_home_page() {
		System.out.println(driver.getTitle());
	}

	@When("^user clicks home link$")
	public void user_clicks_home_link() throws InterruptedException {
//		driver.findElement(By.linkText("Home")).click();
		
		hm.clickhomeLink();
		Thread.sleep(5000);
	}
	
	@Then("^home page should open$")
	public void home_page_should_open() {
		 Assert.assertEquals(driver.getTitle(), "Transfotech Academy - IT Institute");
		 System.out.println(driver.getTitle());
		    
	}



	
	
	}


