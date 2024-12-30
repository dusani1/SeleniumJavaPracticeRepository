package handlingCalenders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderUsingSimpleReusableMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rb.gy/xiehud");
		WebElement datePickerField = driver.findElement(By.id("datepicker"));
		datePickerField.click();
		
	}
	
}
