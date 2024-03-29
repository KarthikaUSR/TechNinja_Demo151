package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Stack_pages {
	private WebDriver driver;
	//locators
	By Getstart_stack=By.xpath("//a[@href='stack']");

	By Oper_Stacklink= By.linkText("Operations in Stack");
	By imple_stack= By.linkText("Implementation");
	By Appli_stack= By.linkText("Applications");
	By Tryherelink= By.linkText("Try here>>>");
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
	By PQ_stacklink= By.xpath("//a[@href='/stack/practice']");
	//constructor
	
	public Stack_pages(WebDriver driver){
			this.driver=driver;
			
		}
	//pageactions
	
	public Stack_pages getstart_stack()
	{
		driver.findElement(Getstart_stack).click();

		return new Stack_pages(driver);//this will link to the step definition of graphs class
	}
	
	public void PQ_stacklinks() {
		driver.findElement(PQ_stacklink).click();
	}

	
	public void clickstacklinks(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Operations in Stack"))
		{
			driver.findElement(Oper_Stacklink).click();
			
		}
		
		else if(string.equalsIgnoreCase("Implementation"))
		{
			driver.findElement(imple_stack).click();
			
		}
		else if(string.equalsIgnoreCase("Applications"))
		{
			driver.findElement(Appli_stack).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}
}
