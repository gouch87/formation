package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Test_facebook {
	public static WebDriver driver;
	@Test
	public void face() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SanaaAchabak\\chromedriver.exe");
	driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fichier = new FileInputStream("C:\\Users\\SanaaAchabak\\eclipse-workspace\\ProjetMaven2\\src\\test\\java\\ressources\\donnees.properties");
		prop.load(fichier);
		
		String monadrese =prop.getProperty("site");
		
		driver.get(monadrese);
		
		pageacc pa =new pageacc(driver);
		pageacc3 pb=new pageacc3(driver);
		
		 WebElement identifiant = pa.loginId();
		 identifiant.sendKeys("badre.gouc@gmail.com");
		 WebElement password = pa.loginMdp();
		 password.sendKeys("badre.gouc@gmail.com");
		 Thread.sleep(2000);
		 WebElement bouton = pa.loginBtn();
		 bouton.click();
		 Thread.sleep(2000);
		 WebElement identifiant1 = pb.loginId();
		 identifiant1.sendKeys("gouch");
		 Thread.sleep(2000);
		 WebElement bouton1 = pb.loginserh();
		 bouton1.click();
		
		 
		
	}
	 public void getscren() throws IOException {
		  long a =System.currentTimeMillis();
		  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\SanaaAchabak\\eclipse-workspace\\ProjetMaven2\\capture\\"+a+"screenshot.png"));
	  }
}
