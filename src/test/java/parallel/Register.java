package parallel;

		
	

   import com_Pages.RegisterPage;
   
   
   import common_Factory.driver_factory;
	
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Register {
		
	
		private RegisterPage Reg_Page=new RegisterPage(driver_factory.getDriver());
	
		
		
		@When("Click Register link")
		public void Click_Register_link() {
			Reg_Page.Registerlink();
			
		 
		}
		
		@Then("Error message {string} below username")
		public void error_message_below_username(String string) {
		    
			Reg_Page.filloutmsg(string);
		}
		
		@Then("Error message {string} below password")
		public void error_message_below_password(String string) {
		    
			Reg_Page.filloutmsg(string);
		}
		
		@Then("Error message {string} below confirm password")
		public void error_message_below_confirm_password(String string) {
			Reg_Page.filloutmsg(string);
		    
		}
		
		@When("Click {string} Link")
		public void click_link(String login) {
		    
			Reg_Page.loginlink();
		}
		
		@When("Enters username as {string} in username textbox")
		public void enters_username_as_in_username_textbox(String string) {
			Reg_Page.send_username(string);
		    
		    
		}
		
		@When("Enter password as {string} in password textbox")
		public void enter_password_as_in_password_textbox(String string) {
		    
			Reg_Page.send_password(string);
		}
		
		@When("Enters {string} in confirmpassword textbox")
		public void enters_in_confirmpassword_textbox(String string) {
		    
			Reg_Page.send_Conpassword(string);
		}
		
		@Then("Clicks register button")
		public void clicks_register_button() {
		    
			Reg_Page.registerbutton();
		}
		
		@Then("Account created with message {string}")
		public void account_created_with_message(String string) {
			Reg_Page.errormsg(string);
		    
		    
		}
		
		@Then("{string} message displayed")
		public void message_displayed(String string) {
		    
			Reg_Page.errormsg(string);
		}

		
		
		}
		
		
		



