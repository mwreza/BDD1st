package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.TestBase;

public class Homepagelayout extends TestBase {

	public Homepagelayout() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//rs-arrow[@class= 'tp-leftarrow tparrows custom']")
	WebElement leftarrow;
	
	@FindBy (xpath = "//rs-arrow[@class= 'tp-rightarrow tparrows custom']")
	WebElement Rightarrow;
	
	@FindBy (xpath="//a[@href='https://transfotechacademy.io/it-training/']")
	WebElement ItTraining;
	
	@FindBy (xpath ="//a[@href='https://transfotechacademy.io/job-placement/']")
	WebElement JobPlacement;
	
	@FindBy (className = "tm-vc_btn3-icon fa fa-chevron-right")
	WebElement ItStaffing;
	
	@F
	
	public void clickleftarrow() {
		leftarrow.click();
	}
	
	public void clickRightarrow() {
		Rightarrow.click();
	}
	


}
