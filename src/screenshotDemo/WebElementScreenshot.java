package screenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
		WebElement drpdown = driver.findElement(By.xpath("//select[@name='selType']"));
		File f = drpdown.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("./screenshots/webelement.png"));
		driver.quit();
	}
}
