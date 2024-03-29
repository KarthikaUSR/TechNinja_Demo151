package parallel;



import com_Pages.Queue_pages;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Queue {
	
	private Queue_pages Q_Page=new Queue_pages(driver_factory.getDriver());

	
	@When("Click on {string} button in Queue")
	
	public void click_getstart_queue(String string) {
	 
		Q_Page.getstart_queue();
		System.out.println("pressed..:"+string);
	}

	@When("^Click (.+) Queue links$")
	
	public void click_queue_links(String s) {
		Q_Page.clickqueuelinks(s);
	    
	}

	@When("Click {string} link in Queue")
	public void click_PQ(String string) {
		Q_Page.PQ_queuelinks();
		System.out.println("pressed..:"+string);
	}

	
}
