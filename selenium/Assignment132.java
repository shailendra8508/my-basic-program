package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement username=driver.findElement(By.id("email"));
username.sendKeys("shailendrakumarhtw1@gmail.com");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("Ss123@7903");
driver.findElement(By.name("login")).click();

	}

}
