package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explore {

	//Static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:/Users/venis/1.jpg");
		/*
		 * try { FileUtils.copyFile(src, dest); } catch (IOException e) { }
		 * 
		 * System.out.println();
		 */

	}}
