package com.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome-Driver\\chromedriver.exe"); 
		RemoteWebDriver Taslima=new ChromeDriver();
		Taslima.get("https://www.google.com/");
		String u=Taslima.getCurrentUrl();
		if(u.equals("https://www.google.com/"))
		{
			System.out.println("Test Case Pass");
		}
		
		else 
		{
			System.out.println("Test Case Fail"); 
		}
		
		Taslima.close(); 

		
	}

}
