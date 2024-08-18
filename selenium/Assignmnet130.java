package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.id("APjFqb")).sendKeys("India");
driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);



	}

}
