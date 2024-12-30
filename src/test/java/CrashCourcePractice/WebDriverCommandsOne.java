package CrashCourcePractice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandsOne {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pagesource = driver.getPageSource();
		String win = driver.getWindowHandle();
		 Set<String> win1 = driver.getWindowHandles();
		 System.out.println(win);
			System.out.println("==============================");	
		System.out.println(title);
		System.out.println("==============================");
		System.out.println(url);
		System.out.println("==============================");
		/*
		 * Thread.sleep(5000); System.out.println(pagesource);
		 * System.out.println("==============================");
		 */
		

	}

}
