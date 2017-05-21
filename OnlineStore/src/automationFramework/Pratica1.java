package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratica1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Storing the Application Url in the String variable
		String url = "http://store.demoqa.com/";

		//Launch the ToolsQA WebSite
		driver.get(url);

		// Storing Title name in the String variable
		String title = driver.getTitle();

		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();

		// Printing Title & Title length in the Console window
		System.out.println("O Título do Site é : " + title);
		System.out.println("O comprimento do Título é : "+ titleLength);

		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)){
			System.out.println("Sucesso na Verificação! - A URL correta foi aberta.");
		}else{
			System.out.println("Falha na Verificação! :( - Outra URL foi aberta.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("URL atual : " + actualUrl);
			System.out.println("URL esperada : " + url);
		}

		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();

		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();

		// Printing length of the Page Source on console
		System.out.println("Comprimento total do conteúdo da página é : " + pageSourceLength);

		//Closing browser
		driver.close();
	}
}
