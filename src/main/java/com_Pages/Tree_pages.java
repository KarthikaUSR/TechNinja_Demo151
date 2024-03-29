package com_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tree_pages {
	private WebDriver driver;
	//locators
	By Getstart_Tree=By.xpath("//a[@href='tree']");

	By overview_tree= By.linkText("Overview of Trees");
	By Term_tree= By.linkText("Terminologies");
	By types_tree= By.linkText("Types of Trees");
	By Traver_tree= By.linkText("Tree Traversals");
	By traverill_tree= By.linkText("Traversals-Illustration");
	By Binary_tree= By.linkText("Binary Trees");
	By type_bin_tree= By.linkText("Types of Binary Trees");
	By Implepython_tree= By.linkText("Implementation in Python");
	By bin_trav_tree= By.linkText("Binary Tree Traversals");
	By imple_bin_tree= By.linkText("Implementation of Binary Trees");
	By App_tree= By.linkText("Applications of Binary trees");
	By bin_search_tree= By.linkText("Binary Search Trees");
	By imp_BST_tree= By.linkText("Implementation Of BST");
	
	By Tryherelink= By.linkText("Try here>>>");
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
	By PQ_treelink= By.xpath("//a[@href='/tree/practice']");
	//constructor
	
	public Tree_pages(WebDriver driver){
			this.driver=driver;
			
		}
	//pageactions
	
	public Tree_pages getstart_tree()
	{
		driver.findElement(Getstart_Tree).click();

		return new Tree_pages(driver);//this will link to the step definition of graphs class
	}
	
	public void PQ_treelinks() {
		driver.findElement(PQ_treelink).click();
	}

	
	public void clicktreelinks(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Overview of Trees"))
		{
			driver.findElement(overview_tree).click();
			
		}
		
		else if(string.equalsIgnoreCase("Terminologies"))
		{
			driver.findElement(Term_tree).click();
			
		}
		
		else if(string.equalsIgnoreCase("Types of Trees"))
		{
			driver.findElement(types_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Tree Traversals"))
		{
			driver.findElement(Traver_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Traversals-Illustration"))
		{
			driver.findElement(traverill_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Binary Trees"))
		{
			driver.findElement(Binary_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Types of Binary Trees"))
		{
			driver.findElement(type_bin_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Implementation in Python"))
		{
			driver.findElement(Implepython_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Binary Tree Traversals"))
		{
			driver.findElement(bin_trav_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Implementation of Binary Trees"))
		{
			driver.findElement(imple_bin_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Applications of Binary trees"))
		{
			driver.findElement(App_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Binary Search Trees"))
		{
			driver.findElement(bin_search_tree).click();
			
		}
		else if(string.equalsIgnoreCase("Implementation Of BST"))
		{
			driver.findElement(imp_BST_tree).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}

		
	  
	}
}
