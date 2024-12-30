package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver = null;
	
	
	@AfterMethod
	public void tearDown() {
		 
		driver.quit();
		System.out.println("Driver closed");
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.21.0");
		System.out.println("First Method Executed");
		
		
	}
	
	
}
