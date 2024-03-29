package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Linkedlist_pages {
	private WebDriver driver;
	//locators
	By Getstart_linkedlist=By.xpath("//a[@href='linked-list']");

	By intro_ll= By.linkText("Introduction");
	By create_ll= By.linkText("Creating Linked LIst");
	By types_ll= By.linkText("Types of Linked List");
	By imple_ll= By.linkText("Implement Linked List in Python");
	By traver_ll= By.linkText("Traversal");
	By insert_ll= By.linkText("Insertion");
	By del_ll= By.linkText("Deletion");
	
	By Tryherelink= By.linkText("Try here>>>");
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
	By PQ_linkedlistlink= By.xpath("//a[@href='/linked-list/practice']");
	//constructor
	
	public Linkedlist_pages(WebDriver driver){
			this.driver=driver;
			
		}
	//pageactions
	
	public Linkedlist_pages getstart_linkedlist()
	{
		driver.findElement(Getstart_linkedlist).click();

		return new Linkedlist_pages(driver);//this will link to the step definition of graphs class
	}
	
	public void PQ_linkedlistlinks() {
		driver.findElement(PQ_linkedlistlink).click();
	}

	
	public void clicklinkedlist(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Introduction"))
		{
			driver.findElement(intro_ll).click();
			
		}
		
		else if(string.equalsIgnoreCase("Creating Linked LIst"))
		{
			driver.findElement(create_ll).click();
			
		}
		else if(string.equalsIgnoreCase("Types of Linked List"))
		{
			driver.findElement(types_ll).click();
			
		}
		else if(string.equalsIgnoreCase("Implement Linked List in Python"))
		{
			driver.findElement(imple_ll).click();
			
		}
		else if(string.equalsIgnoreCase("Traversal"))
		{
			driver.findElement(traver_ll).click();
			
		}
		else if(string.equalsIgnoreCase("Insertion"))
		{
			driver.findElement(insert_ll).click();
			
		}
		else if(string.equalsIgnoreCase("Deletion"))
		{
			driver.findElement(del_ll).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}


}
