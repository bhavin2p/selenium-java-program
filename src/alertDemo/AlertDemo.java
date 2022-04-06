package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='cusid']//following::td[2][input]")).click();
		
		/*
		 * driver.switchTo().alert().accept(); String AlertText =
		 * driver.switchTo().alert().getText();
		 * 
		 * System.out.println(AlertText);
		 */

	}

}
