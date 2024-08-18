package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
 
	}

}
