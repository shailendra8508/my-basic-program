package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/shail/Downloads/learningHTML1.html");
driver.manage().window().maximize();
driver.findElement(By.id("1")).sendKeys("shailendra");
driver.findElement(By.id("2")).sendKeys("course");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("fname")).sendKeys("Shailendra");
driver.findElement(By.name("name1")).click();
driver.findElement(By.name("name2")).click();
driver.findElement(By.name("name3")).click();
	}

}
