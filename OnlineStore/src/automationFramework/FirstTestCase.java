package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the Firefox driver
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();		
			
	//Launch the Online Store Website
			driver.get("http://www.store.demoqa.com");
		 
	// Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
	//Wait for 5 Sec
	        Thread.sleep(5);
				
    // Close the driver
	        driver.quit();
	}
}

