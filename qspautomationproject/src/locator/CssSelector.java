package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);

		driver.findElement(By.name("Username")).sendKeys("nidhiwadakar");

		driver.findElement(By.name("password")).sendKeys("nidhi123");


		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
	}
}


