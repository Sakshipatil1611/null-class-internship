package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePge {

	public WebDriver driver;
	
	public BasePge(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}