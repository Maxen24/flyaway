package com.AppPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Flyaway {
	WebDriver driver;
	
	public static final By clickSignUplink=By.linkText("Not a member? Signup");
	public static final By enterEmailId=By.xpath("//input[@name='email_id']");
	public static final By enterPassword=By.xpath("//input[@name='pwd']");
	public static final By enterConfirmpwd=By.xpath("//input[@name='pwd2']");
	public static final By enterName=By.xpath("//input[@name='name']");
	public static final By enterAddress=By.xpath("//input[@name='address']");
	public static final By enterCity=By.xpath("//input[@name='city']");
	public static final By signUpBtn=By.xpath("//button[normalize-space()='Signup']");
	public static final By regConfirm=By.xpath("//a[normalize-space()='Login to continue checking flights']");
	public static final By loginBtn= By.xpath("//button[normalize-space()='Login']");
	public static final By logOutBtn=By.xpath("//a[normalize-space()='Logout']");
	public static final By homebtn=By.xpath("//a[normalize-space()='Home']");
	public static final By selectSource=By.xpath("//select[@name='source']");
	public static final By selectDestination=By.xpath("//select[@name='destination']");
	public static final By submitBtn=By.xpath("//button[normalize-space()='Submit']");
	public static final By bookFlight=By.xpath("//a[normalize-space()='Book Flight']");
	public static final By completeBooking =By.xpath("//a[normalize-space()='Click to complete booking']");
	public static final By viewBooking=By.xpath("//a[normalize-space()='See Your Bookings']");

}
