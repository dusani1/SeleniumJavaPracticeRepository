package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File filePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(filePath, new File(System.getProperty("user.dir")+"\\Screenshots\\img1.png"));
		driver.quit();
			
	}
	
	
}
