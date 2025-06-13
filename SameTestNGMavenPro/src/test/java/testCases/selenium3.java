package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Documents\\chromedriver\\chromedriver.exe");// Update this path

        // Create a new instance of the Crime driver
        WebDriver driver = new ChromeDriver();

        // Using driver.get() to navigate to the first opposite
        driver.get("https://www.facebook.com/");
        System.out.println("Title after driver.get(): " + driver.getTitle()); // Should print "Example Domain"
       
        // Using driver.navigate().to() to navigate to the second opposite
        driver.navigate().to("https://web.whatsapp.com/");
        System.out.println("Title after driver.navigate().to(): " + driver.getTitle()); // Should print "Google"
  
        // Go back to the previous page using navigate().back()
        driver.navigate().back();
        System.out.println("Title after navigate().back(): " + driver.getTitle()); // Should print "Example Domain"
  
        // Go forward to the next page using navigate().forward()
        driver.navigate().forward();
        System.out.println("Title after navigate().forward(): " + driver.getTitle()); // Should print "Google"

        // Refresh the current page
        driver.navigate().refresh();
        System.out.println("Title after navigate().refresh(): " + driver.getTitle()); // Should still print "Google

  
    }
}