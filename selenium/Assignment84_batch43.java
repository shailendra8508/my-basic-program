package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment84_batch43 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/shail/Downloads/learningHTML1.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Shailendra singh");
driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("hint");
driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("7903");
Thread.sleep(2000);
WebElement fname=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
fname.sendKeys("shailendra");
WebElement lname=driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]"));
lname.sendKeys("singh");

//driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click();
WebElement e1=driver.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
e1.click();
	}

}
