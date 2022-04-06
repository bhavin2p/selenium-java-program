package staleelementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRMstaleDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		WebElement userNames = driver.findElement(By.xpath("//input[@name='username']"));
		userNames.sendKeys("Hello");

	}

}
