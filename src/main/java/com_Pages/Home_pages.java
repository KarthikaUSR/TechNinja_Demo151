package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_pages {
	private WebDriver driver;
	//locators
	//Widgets
		By getstart_DSintro=By.xpath("//a[@href='data-structures-introduction']");
		By getstart_Array=By.xpath("//a[@href='array']");
		By getstart_List=By.xpath("//a[@href='linked-list']");
		By getstart_Stack=By.xpath("//a[@href='stack']");
		By getstart_Queue=By.xpath("//a[@href='queue']");
		By getstart_Tree=By.xpath("//a[@href='tree']");
		By getstart_Graph=By.xpath("//a[@href='graph']");
		By Home_button=By.xpath("//a[@href='/home']");
	//constructor
	
	public Home_pages(WebDriver driver){
			this.driver=driver;
			
		}
	public Home_pages getstart_stack()
	{
		driver.findElement(Home_button).click();

		return new Home_pages(driver);//this will link to the step definition of graphs class
	}
	//pageactions
	
	
	public void clickallgetstartedbutton(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Data Structures-Introduction"))
		{
			driver.findElement(getstart_DSintro).click();
			
		}
		
		else if(string.equalsIgnoreCase("Array"))
		{
			driver.findElement(getstart_Array).click();
			
		}
		else if(string.equalsIgnoreCase("Linked List"))
		{
			driver.findElement(getstart_List).click();
			
		}
		else if(string.equalsIgnoreCase("Stack"))
		{
			driver.findElement(getstart_Stack).click();
			
		}
		else if(string.equalsIgnoreCase("Queue"))
		{
			driver.findElement(getstart_Queue).click();
			
		}
		else if(string.equalsIgnoreCase("Tree"))
		{
			driver.findElement(getstart_Tree).click();
			
		}
		else if(string.equalsIgnoreCase("Graph"))
		{
			driver.findElement(getstart_Graph).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}

}
