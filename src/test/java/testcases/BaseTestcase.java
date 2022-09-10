package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashbordPage;

public class BaseTestcase {

	static WebDriver driver;
    
	DashbordPage db;
	@BeforeSuite
	public void initbrowser() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://m.redbus.in/");
		 
	}
@BeforeClass
	
	public void creatobject()
	{
		db = new DashbordPage(driver);
	}
}
