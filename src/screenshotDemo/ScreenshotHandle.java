package screenshotDemo;

import java.io.File;
import java.io.IOException;
import java.sql.Time;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandle {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		takeScreenshot("googlePage");

	}
	@SuppressWarnings("deprecation")
	static
	long i = Time.UTC(0, 0, 0, 0, 0, 0);
	
	public static void takeScreenshot(String fileName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("./screenshots/"+fileName+System.currentTimeMillis()+".png"));
		FileUtils.copyFile(src, new File("./screenshots/"+fileName+i+".png"));
	}

	
	
	
}
