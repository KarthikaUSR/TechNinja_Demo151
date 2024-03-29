package parallel;



import com_Pages.Home_pages;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Home {
	
	
	private Home_pages H_Page=new Home_pages(driver_factory.getDriver());

	//private Arrays_Page_S2 A_Page=new Arrays_Page_S2(driver_factory.getDriver());
	
	@When("^Click (.+) Get Started buttons$")
	
	public void click_Allgetstart_home(String string) {
	 
		H_Page.clickallgetstartedbutton(string);
		
	}

	

}
