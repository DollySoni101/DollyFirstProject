package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpXpath {
	
	public WebDriver driver;
	By firstname=By.xpath("//input[contains (@id, 'UserFirstName')]");
	//By Lastname=By.xpath("//input[@id='UserLastName-JnVE']");
	//By jobtitle=By.xpath("//input[@id='UserTitle-0BEH']");
	//By nextbutton=By.xpath("//a[@data-page-cntrl='next']");
	
	public SignUpXpath(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	/*public WebElement enterlastname()
	{
		return driver.findElement(Lastname);
	}
	public WebElement enterjobtitle()
	{
		return driver.findElement(jobtitle);
	}
	public WebElement clickonnextbutton()
	{
		return driver.findElement(nextbutton);
	}
	*/
	
	
}
