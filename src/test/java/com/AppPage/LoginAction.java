package com.AppPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Libdriver;

public class LoginAction {
	WebDriver driver;
	
	public String userLogin(String email_id, String pwd) {
		this.driver=Libdriver.driver;
		driver.findElement(POM_Flyaway.regConfirm).click();
		driver.findElement(POM_Flyaway.enterEmailId).sendKeys(email_id);
		driver.findElement(POM_Flyaway.enterPassword).sendKeys(pwd);
		driver.findElement(POM_Flyaway.loginBtn).click();
		String userLogin="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(POM_Flyaway.logOutBtn));
			System.out.println("Try Block");
		}catch(Exception e) {
			userLogin="Fail";
			System.out.println("Catch Block");
		}
		
		return userLogin;
		
	}

}
