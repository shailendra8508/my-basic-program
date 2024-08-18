package basic.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
//driver.get("https://www.google.com");
driver.navigate().to("https://www.google .com");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
	}

}
