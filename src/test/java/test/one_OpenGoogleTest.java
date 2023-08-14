package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class one_OpenGoogleTest {
	
	@Test
	public void launchone() {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/guava-library-java/");
		System.out.println("launchone");
		driver.close();
		
	}

}
