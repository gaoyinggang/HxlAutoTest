package utils;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends UseBrowser {
	
	public String Loginurl="https://mail.163.com/";
	
	UseBrowser userBrowser =new UseBrowser();
	@BeforeSuite
	public void start() throws Exception {
		try {
			userBrowser.startChrome(Loginurl);			
		}catch(Exception e) {
			System.out.println(e);
		}		
		
	}
	@AfterSuite
	public void end() throws Exception{
		userBrowser.tearDownBrowser();
	}
	
}
