package com.AppPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Libdriver;

public class SearchFlight {
	WebDriver driver;
	
	public String SearchingFlight() {
		this.driver=Libdriver.driver;
		driver.findElement(POM_Flyaway.homebtn).click();
		Select obj=new Select(driver.findElement(POM_Flyaway.selectSource));
		obj.selectByIndex(1);
		Select obj2=new Select(driver.findElement(POM_Flyaway.selectDestination));
		obj2.selectByIndex(4);
		driver.findElement(POM_Flyaway.submitBtn);
		String searchingFlight="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(POM_Flyaway.bookFlight));
			System.out.println("Try Block");
		}catch(Exception e) {
			searchingFlight="Fail";
			System.out.println("Catch Block");
		}
		return searchingFlight;
	}

}
