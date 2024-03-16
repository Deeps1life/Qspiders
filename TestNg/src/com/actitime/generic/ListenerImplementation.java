package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

	public class ListenerImplementation extends BaseClass implements ITestListener{
		
	@Override
	public void onTestSuccess(ITestResult result) {
		String res=result.getName();
	Reporter.log(res+" has got passed", true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
	Date d = new Date();
	String res = result.getName();
	Reporter.log(res+" has got failed", true);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("•/screenshots/"+res+ d.toString().replace(":", "_").replace(" ", "_") + ".png");
	try {
	FileUtils.copyFile(src, dest);
	} catch (IOException e) {
	}}
	@Override
	public void onTestSkipped(ITestResult result) {
	String res=result.getName();
	Reporter.log(res+" has got skipped", true);
	}
}
