package services;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseDesign.WebDriverServices;
import events.WebDriverEvents;

public class WebDriverServiceImp extends WebDriverEvents implements WebDriverServices {

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			reportStep("The data" + data + " entered successfully in the field :" + ele, "pass");

		} catch (InvalidElementStateException e) {
			reportStep("The data" + data + " could not enter in the field :" + ele, "fail");

		} catch (IllegalArgumentException e) {
			reportStep("illegal or inappropriate argument  value tried to enter in sendKeys", "fail");
		} catch (WebDriverException e) {
			e.printStackTrace();
			reportStep("Unknown exception occured while entering " + data + " in the field :" + ele, "FAIL");
		}

	}

	public void click(WebElement ele) {
		String text = "";
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			reportStep("The button " + text + " is clicked successfully ", "pass");
		} catch (ElementClickInterceptedException e) {
			reportStep("The element: " + text + " could not be clicked due to interception", "FAIL");
		} catch (InvalidElementStateException e) {
			reportStep("The element" + ele + "could not be clicked", "fail");
		} catch (WebDriverException e) {
			e.printStackTrace();
			reportStep("Unknown exception occured while clicking in the field :", "FAIL");
		}

	}

	public void closeActiveBrowser() {

		try {
			getDriver().close();
			reportStep("The Browser is closed", "pass");
		} catch (Exception e) {
			reportStep("The Browser could not be closed", "fail");
		}

	}

	public void switchToFrame(String nameOrId) {
	
		try {
			
			getDriver().switchTo().frame(nameOrId);
			
		} catch (Exception e) {
			System.out.println("frame exception");
		}
		
		
		
	}

}
