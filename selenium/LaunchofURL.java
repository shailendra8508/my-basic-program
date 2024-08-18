package basic.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchofURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
	}

}
