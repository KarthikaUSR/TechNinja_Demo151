package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datastructure_pages {
	private WebDriver driver;
	
	By Getstart_DSintro=By.xpath("//a[@href='data-structures-introduction']");
	By timecomplexity=By.linkText("Time Complexity");
	By PQ_dsintrolink= By.xpath("//a[@href='/data-structures-introduction/practice']");
	
	//constructor
	
	public Datastructure_pages(WebDriver driver){
		this.driver=driver;
		
	}
	public Datastructure_pages getstart_DS()
	{
		driver.findElement(Getstart_DSintro).click();

		return new Datastructure_pages(driver);//this will link to the step definition of graphs class
	}
	public void PQ_dsintrolinks() {
		driver.findElement(PQ_dsintrolink).click();
	}

	
	public void clickDSintrolinks(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Time Complexity"))
		{
			driver.findElement(timecomplexity).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}
}
