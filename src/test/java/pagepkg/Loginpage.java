package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	WebDriver  driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void loginmthds(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
}
