package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class selenium5 {
    public static void main(String[] args) {
        // Check if the current time is between 12 PM and 5 PM
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(12, 0); // 12 PM
        LocalTime end = LocalTime.of(23, 0);   // 5 PM

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test can only be run between 12 PM and 5 PM.");
            return;
        }

        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sakshi\\\\Documents\\\\chromedriver\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
 		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            // Step 1: Open Amazon
            driver.get("https://www.amazon.in");

            // Step 2: Search for a product
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("Bed");
            searchBox.submit();

            // Step 3: Click on the first product
            WebElement firstProduct = driver.findElement(By.cssSelector(".s-main-slot .s-result-item"));
            firstProduct.click();
           
                
            // Step 4: Add to cart
            WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
            addToCartButton.click();

            // Step 5: Proceed to checkout
            WebElement cartButton = driver.findElement(By.id("nav-cart"));
            cartButton.click();
            
          
            // Step 6: Proceed to checkout
            WebElement proceedToCheckoutButton = driver.findElement(By.name("proceed-to-checkout-action"));
             proceedToCheckoutButton.click();
       
            // Step 7: Login (Assuming you have an account)
            // You need to replace the email and password with your own
            WebElement emailField = driver.findElement(By.id("ap_email"));
            emailField.sendKeys("patilsakshi64424@gmail.com");
            driver.findElement(By.id("continue")).click();

            WebElement passwordField = driver.findElement(By.id("ap_password"));
            passwordField.sendKeys("your_password");
            driver.findElement(By.id("signInSubmit")).click();

            
            // Assuming you have a payment method set up, confirm the order
            WebElement placeOrderButton = driver.findElement(By.name("placeYourOrder1"));
            placeOrderButton.click();

            // Step 9: Confirm order
            System.out.println("Order placed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
