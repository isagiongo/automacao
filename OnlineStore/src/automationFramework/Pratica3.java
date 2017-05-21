package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratica3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
		
		driver.findElement(By.id("menu-item-374")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(appUrl);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
