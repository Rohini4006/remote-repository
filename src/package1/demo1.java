package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\POC using ITAW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.guru99.com";
		driver.get(baseurl);
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is "+ pageTitle);
		driver.close();
	}

}
