package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelingFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://icapidilite-stg.esealcom.com/login");
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ica_admin1@yopmail.com");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("ica@123");
		Boolean selectionStatus = driver.findElement(By.id("cookieCheck")).isSelected();
		if (!selectionStatus) {
			driver.findElement(By.id("cookieCheck")).click();
		}
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()=\"Products\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Manage'])[2]")).click();
		Thread.sleep(5000);
		System.out.println("clicked on Manage");
		driver.findElement(By.xpath("//*[text()=\"Import Products\"]")).click();
		Thread.sleep(5000);
		System.out.println("clicked on Import Products");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='×']")));
		//WebElement heading = driver.findElement(By.xpath("//*[@class='modal-title']"));
		//System.out.println(heading.getText());
		WebElement uploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='files1']")));
	    uploadButton.sendKeys("filepath.xlsx");
		//driver.findElement(By.xpath("//*[text()='Click to download']")).click();
	        
	}
	
	
}
