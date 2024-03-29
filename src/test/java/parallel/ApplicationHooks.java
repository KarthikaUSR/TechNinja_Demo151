package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import common_Factory.driver_factory;
import common_utility.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
	

public class ApplicationHooks {
	private WebDriver driver;
	private driver_factory driverFactory;
	private configReader configReader;
	
	Properties Prop;
	
	@Before(order=0)
	public void getproperty()
	{
		configReader=new configReader();
		Prop=configReader.init_prop();
		
	}
	@Before(order=1)
	public void launchBrowser()
	{
		
		String browserName=Prop.getProperty("browser");
		driverFactory =new driver_factory ();
		driver=driverFactory.init_driver(browserName);
		
	}
	
	
	@After(order=0)
	public void quitbrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ;
			System.out.println("The path for the screen shot is: " + sourcePath);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
	
	
	

}
