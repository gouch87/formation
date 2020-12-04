package pack1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageacc2 {
	
	
	WebDriver driver;
public pageacc2(WebDriver driver) {
		
		this.driver = driver;
	}

	private By login = By.xpath("//*[@id=\"identify_email\"]");
	private By serh = By.xpath("//*[@id=\"u_0_5\"]");
	
	
	
	public WebElement loginId() {
		return (driver.findElement(login));
	}
	
	public WebElement loginserh() {
		return (driver.findElement(serh));
	}
	

}
