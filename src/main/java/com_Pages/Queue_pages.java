package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Queue_pages {
	private WebDriver driver;
	//locators
	By Getstart_queue=By.xpath("//a[@href='queue']");

	By QIP_queue= By.linkText("Implementation of Queue in Python");
	By collection_queue= By.linkText("Implementation using collections.deque");
	By Array_queue= By.linkText("Implementation using array");
	By operation_queue= By.linkText("Queue Operations");
	By Tryherelink= By.linkText("Try here>>>");
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
	By PQ_queuelink= By.xpath("//a[@href='/queue/practice']");
	//constructor
	
	public Queue_pages(WebDriver driver){
			this.driver=driver;
			
		}
	//pageactions
	
	public Queue_pages getstart_queue()
	{
		driver.findElement(Getstart_queue).click();

		return new Queue_pages(driver);//this will link to the step definition of graphs class
	}
	
	public void PQ_queuelinks() {
		driver.findElement(PQ_queuelink).click();
	}

	
	public void clickqueuelinks(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Implementation of Queue in Python"))
		{
			driver.findElement(QIP_queue).click();
			
		}
		
		else if(string.equalsIgnoreCase("Implementation using collections.deque"))
		{
			driver.findElement(collection_queue).click();
			
		}
		else if(string.equalsIgnoreCase("Implementation using array"))
		{
			driver.findElement(Array_queue).click();
			
		}
		else if(string.equalsIgnoreCase("Queue Operations"))
		{
			driver.findElement(operation_queue).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}

}
