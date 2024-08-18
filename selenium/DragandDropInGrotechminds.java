package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropInGrotechminds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://grotechminds.com/drag-and-drop/");
driver.manage().window().maximize();
  WebElement drag=driver.findElement(By.xpath("(//div[@id='container-6'])"));
  WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
  Actions a1=new Actions(driver);
  a1.dragAndDrop(drag,drop).perform();
  WebElement drag1=driver.findElement(By.xpath("(//div[@id='div2'])"));
  WebElement drop2=driver.findElement(By.xpath("(//div[@id='container-6'])"));
  Actions a2=new Actions(driver);
  a1.dragAndDrop(drag1,drop2).perform();
	}

}
