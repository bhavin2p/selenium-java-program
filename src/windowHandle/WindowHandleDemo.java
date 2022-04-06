package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equalsIgnoreCase(parentWindowID)) {
				driver.switchTo().window(window);
				System.out.println(window);
			}
		}
		
		//String title = driver.getTitle();
		System.out.println(parentWindowID);
		
		driver.switchTo().defaultContent();
		
		String parentWindowTitle = driver.getTitle();
		
		System.out.println(parentWindowTitle);
		
		
		
		
		
		
	}

}
