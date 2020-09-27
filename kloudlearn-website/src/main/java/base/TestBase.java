package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import util.TestUtil;

//import util.TestUtil;

public class TestBase {
	  public static WebDriver browser;
	  //TestUtil kloudlearn = new TestUtil();
	  
	    public static void initialization(){
	    	
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("use-fake-ui-for-media-stream");
	    	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	        browser = new ChromeDriver(options);
	        browser.manage().window().maximize();
	        browser.get("https://app.staging-env.kloudlearn.com/auth/login");
	        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }

}
