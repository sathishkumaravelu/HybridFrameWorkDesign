package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNGHooks;

public class LoginPage extends TestNGHooks{
	
	
	public LoginPage typeUsername(String username) {
		switchToFrame("gsft_main");
		type(getDriver().findElement(By.id("user_name")),username);
		return this;
	}

	
	public LoginPage typePassword(String password) {		
		type(getDriver().findElement(By.id("user_password")),password);				
		return this;
	}
	
	public LoginPage clickSubmit() {		
		click(getDriver().findElement(By.id("sysverb_login")));		
		return this;
	}
	
	
	
	public LoginPage interview() {		
		
		getDriver().switchTo().frame(1);
		getDriver().switchTo().defaultContent();
		
		Alert alert = getDriver().switchTo().alert();
		

		
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
