package com.w2a.rough;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rougha {
	
	public static void main(String args[]) {

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	driver.findElement(By.cssSelector("div > div:last-child > .btn.btn-primary.btn-lg")).click();
	
}
}