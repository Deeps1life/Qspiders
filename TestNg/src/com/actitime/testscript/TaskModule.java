package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

	public class TaskModule extends BaseClass{
		
	
	//(groups="smoketest")
	@Test
public void createTask() {
	Reporter.log("createTask", true);
}
	
	//(groups="regressiontest")
	@Test
public void deleteTask() {
	Reporter.log("deleteTask", true);
}
	
	//(groups="regressiontest")
	@Test
public void modifyTask() {
	Reporter.log("modifyTask", true);
}
	
}
