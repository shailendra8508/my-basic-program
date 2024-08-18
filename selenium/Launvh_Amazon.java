package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launvh_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ChromeDriver driver= new ChromeDriver();
  driver.get("https://amazon.in/");
  driver.manage().window().maximize();
  WebElement e1=  driver.findElement(By.xpath("(//input)[5]"));
  e1.sendKeys("shoes");
 // e1.sendKeys(Keys.ENTER);
  WebElement e2=  driver.findElement(By.xpath("(//input)[6]"));
  e2.click();
	}

}
