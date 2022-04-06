package seleniumCodingChallenge1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		
		////div[@class='sc-e3js0d-10 fyFmgb']//span
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		List<WebElement> title = driver.findElements(By.xpath("//div[@class='sc-e3js0d-9 gCnNfT']/div[1]"));
		js.executeScript("windows.scroll(0,350)", "title");
		for(WebElement ele1 : title) {
			System.out.println(ele1.getText());
		}
		
		/*
		 * List<WebElement> ele =
		 * driver.findElements(By.xpath("//div[@class='sc-e3js0d-10 fyFmgb']//span"));
		 * 
		 * for(WebElement ele1 : ele) { System.out.println(ele1.getText()); }
		 */

	}

}
