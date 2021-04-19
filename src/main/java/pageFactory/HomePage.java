package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	
	

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickhomeLink() {
		homeLink.click();
	}

}
