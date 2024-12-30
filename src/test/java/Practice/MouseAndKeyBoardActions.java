package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseAndKeyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://omayo.blogspot.com/");
		driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		
		//****moveToElement(option1).click().build().perform()*********
		//WebElement blogsOption = driver.findElement(By.id("blogsmenu"));
		
		Actions action = new  Actions(driver);
		//action.moveToElement(blogsOption).perform();
		//WebElement option1 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		//action.moveToElement(option1).click().build().perform();
		
		//********Droganddropby()**********************
		WebElement minval = driver.findElement(By.xpath("//a[@aria-labelledby=\"price-min-label\"]"));
		WebElement maxval = driver.findElement(By.xpath("//a[@aria-labelledby=\"price-max-label\"]"));
		action.dragAndDropBy(minval, -100, 0).perform();
		action.dragAndDropBy(maxval, -100, 0).perform();
		action.contextClick(maxval).perform();
		
	}
	
	
	
}
