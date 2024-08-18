 package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("India");
driver.findElement (By.name("q")).sendKeys(Keys.ENTER);
	}

}
