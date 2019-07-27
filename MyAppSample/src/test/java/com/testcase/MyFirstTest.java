package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\mydrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//driver.manage().maximize();
	}

}
