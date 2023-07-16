package com.ebanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(name="uid")
	 @CacheLookup
	 WebElement txtUserName;
	 
	 @FindBy(name="password")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 @FindBy(name="btnLogin")
	 @CacheLookup
	 WebElement btnLogin;
	 
	 public void setUserName(String uname)
	 {
		 txtUserName.sendKeys("mngr505607");
	 }
	 public void setPassword(String pwd)
	 {
		 txtPassword.sendKeys("EnAqYvU");
	 }
	 public void clickSubmit()
	 {
		 btnLogin.click();
	 }
	 
	 

	
}
