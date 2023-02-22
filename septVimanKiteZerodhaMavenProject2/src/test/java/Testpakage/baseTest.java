package Testpakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.dashBoard;
import pages.loginPage2;
import pages.loginPage;

//import Pom.dashBoard;
//import Pom.loginPage;
//import Pom.loginPage2;

public class baseTest {

	static WebDriver driver;
	loginPage2 obj;
	
	dashBoard db;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sai\\Desktop\\AUTOMATION\\notepad programme\\edgedriver_win64\\msedgedriver.exe");
	
		EdgeOptions options=new EdgeOptions();
		options.addArguments("-- disable Notification");
		options.addArguments("-- Start maximized");
		
	//	ChromeOptions opt=new ChromeOptions();
		
		
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//driver.manage().window().maximize();
		
		Properties prop=new Properties();
		String filepath=System.getProperty("user.dir")+"\\config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		prop.load(fis);
		
		
		//driver.get(prop.getProperty("testsiteurl"));*/
		
		
		driver.get("https://kite.zerodha.com/");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 //obj=new loginPage(driver);
		obj=new loginPage2(driver);
		db=new dashBoard(driver);
		
		
	}
	
	
	
	
}
