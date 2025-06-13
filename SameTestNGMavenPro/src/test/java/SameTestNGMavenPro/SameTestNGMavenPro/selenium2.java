package SameTestNGMavenPro.SameTestNGMavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selenium2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Documents\\chromedriver\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();  
        driver.get("https://www.amazon.in/");
       
        // Find the element by its ID
        //WebElement element = driver.findElement(By.id("id=id=\"spch-dlg"));
        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("phones"); 
      
        
    }
        }