package org.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Amazonn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Day3\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("iphone");
	
	WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
	btnSearch.click();
	
}
}
