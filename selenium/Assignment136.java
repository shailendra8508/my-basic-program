package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://grotechminds.com/registeration-form/");
driver.manage().window().maximize();
driver.findElement(By.id("firstName")).sendKeys("shailendra");
driver.findElement(By.id("lastName")).sendKeys("singh");
driver.findElement(By.id("email")).sendKeys("shailendrakumarhtw1@gmail.com");
WebElement phonenumber =driver.findElement(By.id("phone"));
phonenumber.sendKeys("7903280515");
WebElement drop_down1=driver.findElement(By.id("Skills"));
Select s1= new Select(drop_down1);
s1.selectByVisibleText("");


	}

}
