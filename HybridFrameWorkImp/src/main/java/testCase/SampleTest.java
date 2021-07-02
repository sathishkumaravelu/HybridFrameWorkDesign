package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNGHooks;
import pages.LoginPage;

public class SampleTest extends TestNGHooks{

	@BeforeTest(alwaysRun = true)
	public void setData() {
		testCaseName = "TC001";
		testDescription = "to check test case running";
		category = "smoke";
		authors = "sathish";  
		dataSheetName = "TC001";
		sheetName="test";
		nodes = "servicenow";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password) {
		
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickSubmit();
	}
	
	
}
