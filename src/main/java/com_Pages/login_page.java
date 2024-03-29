package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class login_page {
	private WebDriver driver;
	
	//by locator
	//private String URL="https://dsportalapp.herokuapp.com";
	private By Home_button=By.xpath("//a[@href='/home']");
	//login
	private By login_link=By.xpath("//a[@href='/login']");
	private By user_name=By.id("id_username");
	private By pass_word=By.id("id_password");
	private By Login_button=By.xpath("//input[@value='Login']");
	private By userNameDisp=By.xpath("//ul/a[2]");
	private By logout=By.linkText("Sign out");
	By registerlink = By.xpath("//a[@href='/register']");//register link //href="/register"

	
	//constructor of page class
	public login_page (WebDriver driver)
	{
		this.driver=driver;
	}
	//page actions
	//common method
	public String pagetitle()
	{
		return driver.getTitle();
	}
	public void enterHome()
	{		
		//driver.get(URL);
		driver.findElement(Home_button).click();
	}
	public void enterloginpage()
	{		
		driver.findElement(login_link).click();
	}
	
	public void enterUserName(String username)
	{		
		driver.findElement(user_name).sendKeys(username);
	}
	public void enterPassword(String password)
	{		
		driver.findElement(pass_word).sendKeys(password);
	}

	public void clickLoginButton()
	{		
		driver.findElement(Login_button).click();
		//String UserDisp=driver.findElement(userNameDisp).getText();
		
	}
	public String verifylogin()
	{		
		
	 String UserDisp=driver.findElement(userNameDisp).getText();
	 return UserDisp;
		
	}
	public void logout()
	{		
		
	driver.findElement(logout).click();
	 
		
	}
	//common method for login
	//chaining the array page with login page with the reference created in the array page
	
	public Arrays_Page_S2 dologin(String username,String password)
	{
		driver.findElement(login_link).click();
		driver.findElement(user_name).sendKeys(username);
		driver.findElement(pass_word).sendKeys(password);
		driver.findElement(Login_button).click();
		return new Arrays_Page_S2(driver);//this will link to the step definition of array class
	}
	
	
		
}
