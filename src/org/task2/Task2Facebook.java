package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Day3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("Sundar Gaja");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("JSNJH127378");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	
	
	}
}
