package pack1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageacc3 {

	WebDriver driver;

	public pageacc3(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"identify_email\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"u_0_5\"]")

	WebElement link;

	public WebElement loginId() {
		return email;
	}

	public WebElement loginserh() {
		return link;
	}

}
