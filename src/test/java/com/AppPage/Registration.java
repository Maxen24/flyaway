package com.AppPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Libdriver;

public class Registration extends Libdriver {
	WebDriver driver;
	
	public String userRegistration(String email_id, String pwd, String pwd2, String name, String address, String city) {
		this.driver=Libdriver.driver;
		driver.findElement(POM_Flyaway.clickSignUplink).click();
		driver.findElement(POM_Flyaway.enterEmailId).sendKeys(email_id);
		driver.findElement(POM_Flyaway.enterPassword).sendKeys(pwd);
		driver.findElement(POM_Flyaway.enterConfirmpwd).sendKeys(pwd2);
		driver.findElement(POM_Flyaway.enterName).sendKeys(name);
		driver.findElement(POM_Flyaway.enterAddress).sendKeys(address);
		driver.findElement(POM_Flyaway.enterCity).sendKeys(city);
		driver.findElement(POM_Flyaway.signUpBtn).click();
		String userRegistration="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(POM_Flyaway.regConfirm));
		System.out.println("Try block run");
		}catch(Exception e) {
		 userRegistration="fail";
		}
		return userRegistration;
	}

}
