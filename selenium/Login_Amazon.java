package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		  driver.manage().window().maximize();
		WebElement e1=  driver.findElement(By.xpath("(//input)[8]"));
		e1.sendKeys("shailendrakumarhtw1@gmail.com");
		WebElement e2= driver.findElement(By.xpath("(//input)[10]"));
		e2.click();
	}

}
