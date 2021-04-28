package base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream fis = new FileInputStream ("C:\\Users\\wahid\\git\\lockdownteam\\src\\main\\java\\property\\config.properties");
		prop.load(fis);
	}
	
	
	public void initialization () {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	public void ShutDown() {
		driver.close();
	}
}
