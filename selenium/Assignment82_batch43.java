package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment82_batch43 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("APjFqb"));
e1.sendKeys("india");
Thread.sleep(2000);
e1.sendKeys(Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+Keys.ARROW_DOWN);
e1.sendKeys(Keys.ENTER);
	}

}
