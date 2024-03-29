package common_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver_factory {

	public WebDriver Webdriver;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	public WebDriver init_driver(String browser) {
		System.out.println("Browser value is: "+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
			
		}
		
		else if(browser.equalsIgnoreCase("safari"))
		{
			
			tldriver.set(new SafariDriver());
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
			
		}
		else
		{
			System.out.println("Please pass correct browser value: "+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static WebDriver getDriver() {
		
		return tldriver.get();
	}
	
	
	
}
