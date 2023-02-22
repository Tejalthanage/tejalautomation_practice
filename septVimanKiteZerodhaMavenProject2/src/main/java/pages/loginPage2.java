package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage2 {

	WebDriver driver;
	
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='userid']")
	private WebElement userid;
	@FindBy(xpath="//*[@id='password']")
	private WebElement pass;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath="//*[@id='pin']")
	private WebElement pin;
	
	
	public loginPage2(WebDriver driver)
	{
		this.driver=driver;
		//wait=(WebDriverWait) new WebDriverWait(driver, 20);
		wait=new WebDriverWait(driver, 20);
		PageFactory.initElements(driver,this );
	}
	
	public void loginwithcredential()
	{
		//WebElement userid=driver.findElement(By.xpath("//*[@id='userid']"));
		userid.sendKeys("DAA677");
		
		//WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys("Velocity@123");
		
		//WebElement loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
	}
	
	public void invalidCredential()
	{
		//WebElement userid=driver.findElement(By.xpath("//*[@id='userid']"));
		userid.sendKeys("DAA67713234");
		//WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys("Velocity@1231234");
		
		//WebElement loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
		
		
		
	}
	
	public void enterPin()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		pin.sendKeys("866918");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		loginbutton.click();
	}
	
	
	public boolean verfiyURL()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button button-blue']")));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		
		if(url.contains("dashboard"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
