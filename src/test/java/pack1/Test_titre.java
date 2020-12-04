package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_titre {
	@Test
	public void title() {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SanaaAchabak\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
		// TODO Auto-generated method stub
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
