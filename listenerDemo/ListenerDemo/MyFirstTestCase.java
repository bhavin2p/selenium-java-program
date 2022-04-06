package ListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenerDemo.TestNGListener.class)
public class MyFirstTestCase {
	
	@Test
	public void GoogleTitleVerify() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void TitleMatch() {
		System.out.println("Test 2 dummy");
		Assert.assertTrue(false);
	}

}
