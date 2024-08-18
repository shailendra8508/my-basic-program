package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_on_Gmaillink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://google.com");
   driver.manage().window().maximize();
   WebElement gmail_link= driver.findElement(By.linkText("Gmail"));
   gmail_link.click();
	}

}
