package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_on_Amazon_AccountsAndSignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver =new ChromeDriver();
   driver.get("https://www.amazon.in");
   driver.manage().window().maximize();
   
   WebElement accountandlist=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
   Actions a1= new Actions(driver);
   a1.moveToElement(accountandlist).perform();
	}

}
