/**
 * 
 */
package baseDesign;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

/**
 * @author Sathish
 *
 */

public interface WebDriverServices {
	
	
	/**
	 * This method will enter the given value in the text box field
	 *@param ele - The WebElement for the text field in which the data need to be entered by the user 
	 *@param data - The value need to be entered in the text field 
	 *@author sathish
	 *@throws ElementNotVisibleException - Element is not visibile to interacte
	 */		
	public void type(WebElement ele, String data);

	/**
	 * This method will wait for the web element to be clickable and click the element with takesnap
	 *@param ele - The WebElement ( button/link/element) to be clicked
	 *@author sathish
	 *@throws ElementClickInterceptedException - Element is not clickable or intercepted by other element
	 */		
	
	public void click(WebElement ele);
	

	
	/**
	 * This method will close all the active browser
	 *@author sathish
	 *
	 */		
	
	public void closeActiveBrowser();
	
	
	public void switchToFrame(String nameOrId);
	
	
}
