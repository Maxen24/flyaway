package com.AppPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Libdriver;

public class BookFlight {
	
WebDriver driver;
public String bookingFlight() {
	this.driver=Libdriver.driver;
	driver.findElement(POM_Flyaway.bookFlight).click();
	driver.findElement(POM_Flyaway.completeBooking).click();
	String bookingFlight="Pass";
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(POM_Flyaway.viewBooking));
		System.out.println("Try Block");
	}catch(Exception e) {
		bookingFlight="Fail";
		System.out.println("Catch Block");
	}
	return bookingFlight;
}
}
