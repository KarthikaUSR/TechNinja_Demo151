package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphs_page {
	private WebDriver driver;
	//locators
	By Getstart_graph=By.xpath("//a[@href='graph']");

	By Graphlink= By.linkText("Graph");
	By GraphRepresentation= By.linkText("Graph Representations");
	By Tryherelink= By.linkText("Try here>>>");
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
	By PQ_graphlink= By.xpath("//a[@href='/graph/practice']");
	//constructor
	public Graphs_page(WebDriver driver){
		this.driver=driver;
		
	}
	//pageactions
	
	public Graphs_page getstart_G() throws InterruptedException

	{
		Thread.sleep(2000);		driver.findElement(Getstart_graph).click();

		return new Graphs_page(driver);//this will link to the step definition of graphs class
	}
	public void PQ_graphslinks() {
		driver.findElement(PQ_graphlink).click();
	}
	public void clickgraphlinks(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Graph"))
		{
			driver.findElement(Graphlink).click();
			
		}
		
		else if(string.equalsIgnoreCase("Graph Representations"))
		{
			driver.findElement(GraphRepresentation).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}
}
