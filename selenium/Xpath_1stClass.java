package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1stClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();

driver.get("file:///C:/Users/shail/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
e1.sendKeys("Shailendra");
WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
e2.sendKeys("ankit");
	}

}
