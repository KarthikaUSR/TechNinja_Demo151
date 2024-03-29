package parallel;

import org.junit.Assert;

import com_Pages.login_page;
import common_Factory.driver_factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	private login_page loginPage=new login_page(driver_factory.getDriver());
	String Title;
	
	@Given("^Enter Home page portal (.+)$")
	public void enter_home_page_portal(String expected) {
		driver_factory.getDriver().get("https://dsportalapp.herokuapp.com");
		loginPage.enterHome();
		Title=loginPage.pagetitle();
		Assert.assertTrue(Title.equalsIgnoreCase(expected));
		
	}
	@Given("Enter login page")
	public void Enter_loginpage(){
		
		loginPage.enterloginpage();
	}
	

	@When("^Enter User Name (.+)$")
	public void enter_user_name(String expected) {
		
		loginPage.enterUserName(expected);
		
	}

	@When("^Enter Pasword (.+)$")
	public void enter_pasword (String expected) {
		loginPage.enterPassword(expected);

	    
	}

	@When("Click login button")
	public void click_login_button() {

		loginPage.clickLoginButton();
	}

	@Then("^User in Home page (.+)$")
	public void user_in_home_page(String expected) {
		String userVerify=loginPage.verifylogin();
		Assert.assertTrue(userVerify.equalsIgnoreCase(expected));
		System.out.println("Enter user name is : "+expected);

	    
	}
	@Then("Logout")
	public void Logout() {

		loginPage.logout();
	}




}
