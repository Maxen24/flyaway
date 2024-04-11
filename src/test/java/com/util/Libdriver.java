package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Libdriver {
	
	public static WebDriver driver;
	
	public WebDriver getDriver() {
		if(this.driver==null) {
			this.driver=createDriver();
		}
		return this.driver;
	}
	
	public WebDriver createDriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/FlyAway/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
