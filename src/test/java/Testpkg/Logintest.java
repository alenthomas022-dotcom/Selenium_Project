package Testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.BaseClass;

public class Logintest extends BaseClass
{
	@Test
	public void titleverification()
	{
		String actualtitle=obj.titlemthd();
		Assert.assertEquals(actualtitle, "Post your Property - Login | Keralaproperty");
	}
	
	@Test
	public void logintest()
	{
		obj.loginmthds("peter123@gmail.com","peterthechosen" );
	}
}
