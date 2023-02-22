package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashBoard {

    WebDriver driver;
	
	WebDriverWait wait;
	@FindBy(xpath="//*[@class='button-blue']")
	WebElement getstartbutton;
	
	@FindBy(xpath="(//*[@type='text'])[2]")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@class='search-result-item selected']")
	WebElement sbin;
	
	
	
	public dashBoard(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, 50);
		PageFactory.initElements(driver,this );
	}
	
	public void serachbox()
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(getstartbutton));
		
		
		getstartbutton.click();
		searchbutton.sendKeys("sbin");
		
		Actions act=new Actions(driver);
		act.sendKeys(searchbutton,Keys.ENTER).perform();;
		
	}
}
