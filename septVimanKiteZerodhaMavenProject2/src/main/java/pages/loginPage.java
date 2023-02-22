package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	WebDriver driver;
	
	WebDriverWait wait;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		wait=(WebDriverWait) new WebDriverWait(driver, 20);
	}
	
	public void loginwithcredential()
	{
		WebElement userid=driver.findElement(By.xpath("//*[@id='userid']"));
		userid.sendKeys("DAA677");
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys("Velocity@123");
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
	}
	
	public void invalidCredential()
	{
		WebElement userid=driver.findElement(By.xpath("//*[@id='userid']"));
		userid.sendKeys("DAA67713234");
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys("Velocity@1231234");
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
		
	}
	
	public void enterPin()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	
	public boolean verfiyURL()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
