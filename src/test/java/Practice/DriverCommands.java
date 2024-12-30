`package Practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommands {
		public static void main(String[] args) throws InterruptedException {
		
		//Open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9062177%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAjw5qC2BhB8EiwAvqa41qTYbYKlRFmwQKyOr-hNTg0VZ6AwIqOKa_BjlGPSRQ2L1Asy3FFOhxoCdroQAvD_BwE");
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		
		//Set size of the window
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		//Set position of the window
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		
		//Minimize the window
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		// Maximize the window
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		// close all opend browsers
		driver.quit();
	}
	
	
	
}
