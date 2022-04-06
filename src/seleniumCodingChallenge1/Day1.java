package seleniumCodingChallenge1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_current_year = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_current_today_pop = "//div[text()='Today' or text()='This year']//parent::div//span[@class='rts-counter']";
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");

		driver.manage().window().maximize();
		
		//printPopulationData(xpath_current_pop);
		//printPopulationData(xpath_today_pop);
		//printPopulationData(xpath_current_year);
		printPopulationData(xpath_current_today_pop);
		
	}

	public static void printPopulationData(String locator) throws InterruptedException {
		int count = 1;
		while (count<=20) {
			System.out.println(count + " sec");
			if(count == 20) break;
			List<WebElement> popList = driver.findElements(By.xpath(locator));
			
			for (WebElement e : popList) {
				System.out.println(e.getText());
			}
			
			Thread.sleep(1000);
			count++;
			
		}
	}

}
