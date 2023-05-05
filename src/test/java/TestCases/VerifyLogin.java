package TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class VerifyLogin extends baseClass{ 
 @Test
 public void login() throws IOException {  
    
  LoginPageObject  LPO=new LoginPageObject(driver);
  
  LPO.enterUsername().sendKeys("rahul");  
  LPO.enterPassword().sendKeys("123");
  LPO.clickLogin().click(); 
  
  String actualText=LPO.errorMsg().getText();
  String expectedText="Error in Login";
  SoftAssert assertion=new SoftAssert();
  assertion.assertEquals(actualText, expectedText, "ERROR");
  assertion.assertAll();
    }
 
  
}
	 
	 
	 

	