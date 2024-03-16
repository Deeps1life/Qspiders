package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng. annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;


	@Listeners(com.actitime.generic.ListenerImplementation.class)
	public class CustomerModule extends BaseClass {
	
	@Test
public void createCustomer() {
	Assert.fail();
	Reporter.log("createCustomer", true); 
}
	
	//(groups="regressiontest")
	@Test
public void deleteCustomer () {
	Reporter.log("deleteCustomer", true);
}
	
	//(groups="regressiontest", dependsOnMethods = "createCustomer")
	@Test
public void modifyCustomer() {
	Reporter.log("modifyCustomer", true);
}

}
