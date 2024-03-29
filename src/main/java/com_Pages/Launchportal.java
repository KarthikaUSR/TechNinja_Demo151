package com_Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common_Factory.driver_factory;


public class Launchportal {
	
		private WebDriver driver;
		
		
		private String URL="https://dsportalapp.herokuapp.com";
		private By Home_button=By.xpath("//a[@href='/home']");
		
		private By login_link=By.xpath("//a[@href='/login']");
		private By user_name=By.id("id_username");
		private By pass_word=By.id("id_password");
		private By Login_button=By.xpath("//input[@value='Login']");
		
		private By logout=By.linkText("Sign out");

		
		
		public Launchportal (WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		public void enterportal() {
			driver_factory.getDriver().get(URL);
			driver.findElement(Home_button).click();
			
			
		}
		public void launchportal(String username,String password)
		{
			driver.findElement(login_link).click();
			driver.findElement(user_name).sendKeys(username);
			driver.findElement(pass_word).sendKeys(password);
			driver.findElement(Login_button).click();
		
		}
		public void logout()
		{
			
			driver.findElement(logout).click();
		
		}
		
		
	

}
