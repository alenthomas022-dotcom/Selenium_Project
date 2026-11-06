package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Loginpage;

public class BaseClass 
{
	public static WebDriver driver;
	public Loginpage obj;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objmthd()
	{
		obj=new Loginpage(driver);
	}
}
