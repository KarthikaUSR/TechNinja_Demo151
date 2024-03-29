package parallel;




import com_Pages.Stack_pages;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Stack {
	
	private Stack_pages A_Page=new Stack_pages(driver_factory.getDriver());

	//private Arrays_Page_S2 A_Page=new Arrays_Page_S2(driver_factory.getDriver());
	
	@When("Click on {string} button in stack")
	
	public void click_getstart_stack(String string) {
	 
		A_Page.getstart_stack();
		System.out.println("pressed..:"+string);
	}

	@When("^Click (.+) stack links$")
	
	public void click_graph_graphs_links(String s) {
		A_Page.clickstacklinks(s);
	    
	}

	@When("Click {string} link in stack")
	public void click_PQ(String string) {
		A_Page.PQ_stacklinks();
		System.out.println("pressed..:"+string);
	}

	

}
