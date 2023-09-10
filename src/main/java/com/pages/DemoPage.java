package com.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.tools.javac.util.Assert;

public class DemoPage {

	private WebDriver driver;
	

	// 1. By Locators: OR

	private By home_page = By.xpath("//h2");
	private By login_page = By.xpath("//div[@id='rightPanel']/p");
	private By user_name = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//input[@type='submit']");

	// 2. Constructor of the page class:
	public DemoPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}



	public void enterUserName(String username) {
		driver.findElement(user_name).sendKeys(username);
	}
	
	public void enter_password(String pass_word) {
		driver.findElement(password).sendKeys(pass_word);
	}

	public boolean verify_home_page() throws InterruptedException
	{
		Thread.sleep(2000);
		String home_string = driver.findElement(home_page).getText();
		Boolean home_condition = home_string.contains("Customer Login");
		return home_condition;
	}
	
	public boolean verify_login() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(2000);
		String login_string = driver.findElement(login_page).getText();
		Boolean login_condition = login_string.contains("The username and password could not be verified.");
		return login_condition;
	}
	
	
	
}