package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("http://165.227.171.147/#!feed");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Sign In")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"mail\"]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"mail\"]/div/div/input")).sendKeys("testing@test.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"pass\"]/div/div/input")).sendKeys("test1234");
		
		driver.findElement(By.id("action")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("SignOut")).click();
		

	}

}
