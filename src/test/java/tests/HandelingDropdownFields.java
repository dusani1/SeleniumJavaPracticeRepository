package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingDropdownFields {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://icapidilite-stg.esealcom.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ica_admin1@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ica@123");
		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::span[text()='Remember me']"));
		if(!rememberMe.isSelected()) {
			rememberMe.click();
		}
		WebElement coockies = driver.findElement(By.xpath("//input[@type='checkbox'][@name='cookieCheck']"));
		if(!coockies.isSelected()) {
			coockies.click();
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
//		driver.findElement(By.xpath("//*[text()='Authorization']")).click();
//		driver.findElement(By.xpath("//*[text()='Users']")).click();
//		
//		driver.findElement(By.xpath("//*[text()='Add User']")).click();
//		Thread.sleep(9000);
//		//WebElement locationTypeDropDown= driver.findElement(By.xpath("//*[text()='Location Type*']/following-sibling::div/div/select"));
//		
//		//Handeling dropdownfield
//		//Select select = new Select(locationTypeDropDown);
//		//select.selectByVisibleText("Plant");
//		//select.selectByIndex(1);
//		//select.selectByValue("20");
//		//boolean result = select.isMultiple();
//		//System.out.println(result);
//		List<WebElement> options = select.getOptions();
//		for(WebElement option: options) {
//			System.out.println(option.getText());
//		}
		
		driver.findElement(By.xpath("//*[text()='Reports']")).click();
		driver.findElement(By.xpath("//*[text()='Inventory Report']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Filter']")).click();
		Thread.sleep(2000);
		WebElement productGroupOpt = driver.findElement(By.xpath("//label[text()='Product Group']/following-sibling::div/div/div"));
		productGroupOpt.click();	
		WebElement sampleOption = driver.findElement(By.xpath("//*[text()='Sample']"));
		sampleOption.click();
				
		
		
		
		
		
		
		
		driver.quit();
		
	}
	
	
	
}
