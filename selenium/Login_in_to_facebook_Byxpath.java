package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_in_to_facebook_Byxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ChromeDriver driver = new ChromeDriver();
  driver.get("https://www.facebook.com/login/");
  driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@id=\"email\"]"));
     
  
	}

}
