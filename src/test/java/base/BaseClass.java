package base;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Utilities;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		// Setup ChromeDriver
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");

		driver = new ChromeDriver(options);					

		// Maximize Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				Properties property = Utilities.getProperty();
				
				String url = property.getProperty("clientUrl");
				driver.get(url);
									
	}
	
	@AfterMethod
	public void tearDown() {

		System.out.println("End Time : " + LocalDateTime.now());
//		    if(driver != null) {
//		        driver.quit();
//		    }
		}

}
