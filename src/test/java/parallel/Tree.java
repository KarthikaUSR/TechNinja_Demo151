package parallel;


import com_Pages.Tree_pages;
import common_Factory.driver_factory;
import io.cucumber.java.en.When;

public class Tree {
private Tree_pages T_Page=new Tree_pages(driver_factory.getDriver());

	
	@When("Click on {string} button in Tree")
	
	public void click_getstart_tree(String string) {
	 
		T_Page.getstart_tree();
		System.out.println("pressed..:"+string);
	}

	@When("^Click (.+) Tree links$")
	
	public void click_tree_links(String s) {
		T_Page.clicktreelinks(s);
	    
	}

	@When("Click {string} link in Tree")
	public void click_PQ(String string) {
		T_Page.PQ_treelinks();
		System.out.println("pressed..:"+string);
	}

}
