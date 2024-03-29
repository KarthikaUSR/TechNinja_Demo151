package parallel;

import com_Pages.Linkedlist_pages;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Linkedlist {
private Linkedlist_pages L_Page=new Linkedlist_pages(driver_factory.getDriver());

	
	@When("Click on {string} button in Linkedlist")
	
	public void click_getstart_linkedlist(String string) {
	 
		L_Page.getstart_linkedlist();
		System.out.println("pressed..:"+string);
	}

	@When("^Click (.+) Linkedlist links$")
	
	public void click_linkedlist_links(String s) {
		L_Page.clicklinkedlist(s);
	    
	}

	@When("Click {string} link in Linkedlist")
	public void click_PQ(String string) {
		L_Page.PQ_linkedlistlinks();
		System.out.println("pressed..:"+string);
	}

}
