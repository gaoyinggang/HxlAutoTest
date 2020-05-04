package utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class UseBrowser {

	public static WebDriver driver;
	private static final Logger LOGGER = Logger.getLogger(UseBrowser.class);


	public WebDriver startChrome(String url) throws Exception {
		try {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOGGER.info("浏览器打开成功");
		} catch (Exception e) {
			LOGGER.error("浏览器打开失败",e);
		}

		return driver;

	}

	public void tearDownBrowser() throws Exception {
		try {
			Thread.sleep(2000);
			driver.close();
			driver.quit();
			LOGGER.info("浏览器关闭成功");
		} catch (Exception e) {
			LOGGER.error("浏览器关闭失败",e);
		}

	}

}
