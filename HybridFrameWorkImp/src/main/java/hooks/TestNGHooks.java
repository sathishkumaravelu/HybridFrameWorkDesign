package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import services.WebDriverServiceImp;
import utils.DataInputProvider;

public class TestNGHooks extends WebDriverServiceImp {

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		startReport();
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		startTestCase(testCaseName, testDescription);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		startCreateNode(nodes);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions options = new ChromeOptions();

		if (properties.getProperty("Headless").equalsIgnoreCase("true"))
			options.setHeadless(true);

		webdriver = new ChromeDriver(options);
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);

		tlDriver.set(driver);

		getDriver().manage().window().maximize();
		getDriver().get(properties.getProperty("URL"));
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	//@BeforeMethod(alwaysRun = true)
	public void startLogin() {

		switchToFrame("gsft_main");
		type(getDriver().findElement(By.id("user_name")), properties.getProperty("userName"));
		type(getDriver().findElement(By.id("user_password")), properties.getProperty("password"));
		click(getDriver().findElement(By.id("sysverb_login")));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		closeActiveBrowser();
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		endResult();
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName,sheetName);		
	}	

	
}
