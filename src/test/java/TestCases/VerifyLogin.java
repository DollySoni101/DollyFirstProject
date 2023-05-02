package TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class VerifyLogin extends baseClass{ 
 @Test
 public void login() throws IOException {  
  initializeDriver() ; 
  driver.get("https://login.salesforce.com/");
    
  LoginPageObject  LPO=new LoginPageObject(driver);  
  LPO.enterUsername().sendKeys("rahul");  
  LPO.enterPassword().sendKeys("123");
  LPO.clickLogin().click();  
    
    }
 
  
}
	 
	 
	 

	