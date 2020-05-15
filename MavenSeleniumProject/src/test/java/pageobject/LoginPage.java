package pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.BaseTest;
import utils.UseBrowser;

public class LoginPage extends BaseTest{
	private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
//	JavascriptExecutor js = (JavascriptExecutor) driver; 
		
	public void login(String username, String password) throws Exception  {
		
		//判断邮箱密码登录
		WebElement element=driver.findElement(By.id("appLoginTab"));
		if(element.isDisplayed()) {
			driver.findElement(By.id("lbNormal")).click();
			Thread.sleep(2000);
		}			
//		进入iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='loginDiv']/descendant::iframe[1]")));
//		输入用户名密码
		driver.findElement(By.name("email")).sendKeys(username);;		
		driver.findElement(By.name("password")).sendKeys(password);
//		点击登录
		driver.findElement(By.id("dologin")).click();
		Thread.sleep(2000);	
//		跳出iframe
		driver.switchTo().defaultContent();
		
	}

}
