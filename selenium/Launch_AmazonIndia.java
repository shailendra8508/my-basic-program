package basic.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_AmazonIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://Amazone.com");
     driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}
