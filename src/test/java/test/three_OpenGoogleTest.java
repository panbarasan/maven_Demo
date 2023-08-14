package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class three_OpenGoogleTest {
	
	@Test
	public void launchtwo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/guava-library-java/");
		System.out.println("launchtwo");
		driver.close();
		
	}

}
