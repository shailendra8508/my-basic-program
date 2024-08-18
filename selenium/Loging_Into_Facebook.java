package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loging_Into_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("shailendrakumarhtw1@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Ss123@7903");
		
	}

}
