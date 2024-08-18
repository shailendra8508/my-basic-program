package basic.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_Batch43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
driver.close();

	}

}
