package parallel;


import com_Pages.Datastructure_pages;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Datastructure {
	
	private Datastructure_pages DS_Page=new Datastructure_pages(driver_factory.getDriver());
	
	
	

	@When("Click on {string} button in Data Structures-Introduction")
	public void click_on_button_in_data_structures_introduction(String string) {
		DS_Page.getstart_DS();
		System.out.println("pressed..:"+string);
	}

	@When("Click {string} link in DS_Intro")
	public void click_on_PR_DSintro(String string) {
		DS_Page.PQ_dsintrolinks();
		System.out.println("pressed..:"+string);
	}

	
	@When("^Click (.+) Time Complexity links$")
	public void click_Time_Complexity_links(String string) {
	 
		DS_Page.clickDSintrolinks(string);
		System.out.println("pressed..:"+string);
	}


}
