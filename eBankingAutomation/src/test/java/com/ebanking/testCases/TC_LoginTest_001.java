package com.ebanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void logintest() throws IOException {
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("GTPL Bank Manager HomePage"));
		if(!driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			captureScreen(driver, "loginTests");
		}
	}
}
