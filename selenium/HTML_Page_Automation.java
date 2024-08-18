package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Page_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new ChromeDriver();
   driver.get("file:///C:/Users/shail/Downloads/learningHTML1.html");
   driver.manage().window().maximize();
         WebElement e1= driver.findElement(By.xpath("(/html/body/input)[1]"));
        
         e1.sendKeys("shailendra");
              WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
              e2.sendKeys("Hello");
              WebElement e3=driver.findElement(By.xpath("(/html/body/input)[3]"));
              e3.sendKeys("79034");
              WebElement e4= driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
              e4.sendKeys("Shailendra");
              
             
              WebElement e7 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
              e7.click();
	}

}
