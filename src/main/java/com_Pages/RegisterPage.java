package com_Pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





	public class RegisterPage {
		

	    private WebDriver driver;
	    
	    By getstartedBtn =By.xpath("//button[@class='btn']");
		By registerlink = By.xpath("//a[@href='/register']");//register link //href="/register"
		By userNameTxtbox=By.xpath("//input[@name='username']");
		By passwordTxtbox= By.xpath("//input[@name='password1']");
		By confirmPasswordTxt=By.xpath("//input[@id='id_password2']"); 
		By submitRegisterBtn=By.xpath("//input[@type='submit']");
		
		By error_message=By.xpath("//div[@class='alert alert-primary']");
		By login_link=By.xpath("//a[@href='/login']");
		//div[@class='alert alert-primary'] " password_mismatch:The two password fields didn’t match. "
		// TechNinja - username pw:Karthi@12345
		//" New Account Created. You are logged in as TechNinja "
		
		
		
		public RegisterPage(WebDriver driver){
			this.driver=driver;
			
		}
		public RegisterPage Registerlink()
		{
	    	driver.findElement(registerlink).click();;
			return new RegisterPage(driver);//this will link to the step definition of graphs class
		}
		public void registerbutton() {
			driver.findElement(submitRegisterBtn).click();;
		}
		public void loginlink() {
			driver.findElement(login_link).click();;
		}
		public void send_username(String string) {
			driver.findElement(userNameTxtbox).sendKeys(string);
		}
		public void send_password(String string) {
			driver.findElement(passwordTxtbox).sendKeys(string);
		}
		public void send_Conpassword(String string) {
			driver.findElement(confirmPasswordTxt).sendKeys(string);
			
		}
		
		public void errormsg(String string) {
			String msg=driver.findElement(error_message).getText();
			if(string.equalsIgnoreCase(msg))
			{
				System.out.println("Test pass");
			}
			else
			{
				System.out.println("Test fail");
			}
			
		}
		public void filloutmsg(String string) {
			
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		if(messageStr.equalsIgnoreCase(string))
		{
			System.out.println("Actual message" );
		}
		else
		{
			System.out.println("wrong message" );
		}
		}
		
		
		
		

	}



