package demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends utils.BaseTest {

	pageobject.LoginPage loginPage = new pageobject.LoginPage();
	
	@Test(dataProvider="userinfo")
	public void loginTest(String username,String password) throws Exception {
		String title = "";
		loginPage.login(username, password);
		title = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertTrue(true);

	}
	@DataProvider(name="userinfo")
	public Object[][] UserInfo(){
		return new Object[][] {{"15319781701","Hxl_19921106"}};
	}
		
	

}
