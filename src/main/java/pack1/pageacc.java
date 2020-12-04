package pack1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageacc {
	
	
	WebDriver driver;
public pageacc(WebDriver driver) {
		
		this.driver = driver;
	}

	private By login = By.xpath("//*[@id=\"email\"]");
	private By mdp = By.xpath("//*[@id=\"pass\"]");
	private By btn = By.xpath("//*[@id=\"u_0_a\"]/div[3]/a");
	
	
	public WebElement loginId() {
		return (driver.findElement(login));
	}
	
	public WebElement loginMdp() {
		return (driver.findElement(mdp));
	}
	public WebElement loginBtn() {
		return (driver.findElement(btn));
	}

}
