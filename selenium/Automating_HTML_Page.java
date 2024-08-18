package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_HTML_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shail/Downloads/learningHTML1.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("shailendra");
driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("hello");
driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("79034");
	}

}
