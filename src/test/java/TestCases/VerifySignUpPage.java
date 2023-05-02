package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpXpath;
import Resources.baseClass;

public class VerifySignUpPage extends baseClass
{
	@Test
	public void signup() throws IOException, InterruptedException
	{
		initializeDriver() ;
		  driver.get("https://login.salesforce.com/");
		  
		  LoginPageObject  LPO=new LoginPageObject(driver);  
		  
		  LPO.ClickOntryForFree().click();
		 // Thread.sleep(6000);
		 
		  SignUpXpath sp=new SignUpXpath(driver);
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  //sp.enterfirstname().click();
		 sp.enterfirstname().sendKeys("dolly");
		  
		  
		   
		
	}

}
