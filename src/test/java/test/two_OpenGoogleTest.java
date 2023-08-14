package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class two_OpenGoogleTest {
	
	@Test
	public void launchthree() {
		//WebDriverManager.chromedriver().setup(); from selenium 4.9.0 we no need webdrivermanager
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/guava-library-java/");
		System.out.println("launchthree");
		driver.close();
	}

}
