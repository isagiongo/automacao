package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratica2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.id("ui-id-3")).click();
		
		String title = driver.getTitle();

		System.out.println("Título da página: " + title);
        Thread.sleep(5);

		driver.quit();
	}

}
