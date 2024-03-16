package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

	public class ProjectModule extends BaseClass{
		
	
	//(groups="smoketest")
	@Test
public void createProject() {
		//Assert.fail();
	Reporter.log("createProject", true);
}
	
	//(groups="regressiontest")
	@Test
public void deleteProject() {
	Reporter.log("deleteProject", true);
}
	
	//(groups="regressiontest")
	@Test
public void modifyProject() {
	Reporter.log("modifyProject", true);
}

}
