package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage{

	@FindBy(xpath = "//*[@data-id='1492']")
	WebElement fromcity;
	
	@FindBy(xpath = "//*[@data-id='130']")
	WebElement tocity;
	
	@FindBy(xpath = "(//*[@type='text'])[3]")
	WebElement date;
	
	@FindBy(xpath = "//*[@class='current day']")
	WebElement currentday;
	
	@FindBy(xpath = "//*[@id='search_btn']")
	WebElement search;
	
	WebDriver driver;
	public  DashbordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void Input()
	{
		Actions act = new Actions(driver);
		fromcity.sendKeys("parbhani");
		act.sendKeys(Keys.ENTER);
		tocity.sendKeys("pune");
		act.sendKeys(Keys.ENTER);
		date.click();
		
		currentday.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		search.click();
	}
	
}
