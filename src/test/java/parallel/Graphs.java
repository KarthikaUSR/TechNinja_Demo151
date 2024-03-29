package parallel;


import com_Pages.Graphs_page;

import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Graphs {
	
	private Graphs_page Graph_P=new Graphs_page(driver_factory.getDriver());
	
	
	
	
	@When("Click on {string} button in Graph")
	public void click_on_button_in_graph(String string) throws InterruptedException {
	 
		Graph_P.getstart_G();
		System.out.println("pressed..:"+string);
	}

	@When("^Click (.+) Graphs links$")
	public void click_graph_graphs_links(String s) {
		Graph_P.clickgraphlinks(s);
	    
	}

	@When("Click {string} link in graphs")
	public void click_link(String string) {
		Graph_P.PQ_graphslinks();
		System.out.println("pressed..:"+string);
	}

	



}
