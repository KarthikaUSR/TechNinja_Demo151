package parallel;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;



import com_Pages.Arrays_Page_S2;
import com_Pages.login_page;
import common_Factory.driver_factory;
import common_utility.Excelreader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Arrays_S2 {
	
	private login_page login_A=new login_page(driver_factory.getDriver());
	private Arrays_Page_S2 A_Page;
	String Title;
	String codeline;
	
	@Given("Enter DS Algo portal")
	public void enter_ds_algo_portal() {
		driver_factory.getDriver().get("https://dsportalapp.herokuapp.com");
		login_A.enterHome();
	    
	}

	@Given("Do Login")
	public void do_login(DataTable datatable) {
		List<Map<String,String>> credentials=datatable.asMaps();
		String username=credentials.get(0).get("username_a");
		String password=credentials.get(0).get("password_a");
		// need to create separate method in Array_pages_S2 class for do login or creATE referene for Array_pages  
		A_Page=login_A.dologin(username, password);
	}

	@When("Click on {string} button in Array")
	public void click_on_button_in_array(String string) {
		A_Page.arraypage(string);
	    
	
	}

	@Then("{string} page should open")
	public void arraypage_assert(String string) {	    
	    String Title=login_A.pagetitle();
	    Assert.assertTrue(Title.equalsIgnoreCase(string));
	}
	@When("^Click (.+) array links")
	public void arrayspage_links(String string) {
	    
		A_Page.click_arrayspage(string);//chk
		

	}

	@Then("^(.+) Page should open$")
	public void arraypages_should_open(String string) {
		String Title=login_A.pagetitle();
	    Assert.assertTrue(Title.equalsIgnoreCase(string));
	    
	}
	@When("Click {string} button")
	public void click_button(String string) {
	    
		A_Page.try_button(string);
	}
	@Then("Editor box should open with run button")
	public void editor_box_should_open_with_run_button() {
		String Title=login_A.pagetitle();
	    Assert.assertTrue(Title.equalsIgnoreCase("Assessment"));
	    System.out.println(Title);
	    
	}
	@When("^Type Sample (.+) and click run button$")
	public void type_code_click_run_button(String string) {
	    
	    A_Page.sendcode(string);
	    A_Page.runbutton();
	}
	@Then("^(.+) should displayed$")
	public void result_displayed(String string) {
	    A_Page.result(string);
	    
	    
	}
	@When("Clear Editor Box and type {string}")
	public void clear_editor_box_and_type(String string) {
	    
		A_Page.cleartxtbox();
		A_Page.sendcode(string);
	}
	@When("Click on {string} link")
    public void AIP_links(String string) {
	    
		A_Page.AIP_link(string);
		

	}

	
	@When("Click on {string} link in Array")
    public void Practice_Question_links(String string) {	    
		A_Page.PracticeQuestion_link(string);
	}

	@When("^click (.+) practical questions link$")
	public void PQ_pages(String PQ_name) {
		A_Page.click_All_PQ(PQ_name);//chk
	}
	
	@When("^Type valid code for question in editor box (.+)$")
    public void Type_valid_code(String Sheet_Name)throws InvalidFormatException, IOException{
		A_Page.cleartxtbox();
		Excelreader reader = new Excelreader();
		String code = reader.readExcelSheet_validcode(Sheet_Name);
		A_Page.sendcode_SIA(code,Sheet_Name);
		
		
		
		
	}
	@When("Click Run and Submit button")
	public void Click_Run_and_Submit_button() throws InterruptedException{
		A_Page.runbutton();
		A_Page.submitbutton();
	}
	@Then("{string} message displayed in console")
	public void message_in_console(String string){
		String output=A_Page.result_PQ(string);
		Assert.assertTrue(output.equalsIgnoreCase(string));
		
		
	}
	
	@When("Clear Editor Box")
	public void Clear_Editor_Box_array() throws InterruptedException{
		
		A_Page.cleartxtbox_array();
		
	}
	@When("^Type invaid code for question in editor box (.+)$")
	public void Type_invaid_code(String Sheet_Name)throws InvalidFormatException, IOException, InterruptedException{
		
		Excelreader reader = new Excelreader();
		String code = reader.readExcelSheet_invalidcode(Sheet_Name);
		System.out.println(code);
		A_Page.sendcode_SIA(code,Sheet_Name);
		
	}
	
	
	@When("Javacode type {string}")
	public void java_code(String string){
	    
		A_Page.sendcode(string);
	}
	
	
	@When("click run button")
	public void runbutton()
	{
		A_Page.runbutton();
	}
	@Then("Alert should displayed as {string} with ok button")
	public void alert_with_ok_button(String string) {
		A_Page.alert(string);
	}
	@When("Click Submit button")
	public void Submit_button() throws InterruptedException {
		A_Page.submitbutton();
		
	}
	@When("Clear Editor Box empty")
	public void Editor_Box_empty() {
		
	
		A_Page.cleartxtbox();
	}
	
	@When("click browser right arrow to go back")
	public void goback_browser() {
	    
	    A_Page.browserback();
	}

	
}
