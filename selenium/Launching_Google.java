package basic.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Google {
public static void main (String[]args) {
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.quit ();
}
}
