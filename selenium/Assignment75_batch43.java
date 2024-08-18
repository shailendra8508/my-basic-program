package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment75_batch43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.name("email")).sendKeys("shailendrakumarhtw1@gmail.com");
driver.findElement(By.name("pass")).sendKeys("7903ss@123");
driver.findElement(By.name("login")).click();

	}

}
