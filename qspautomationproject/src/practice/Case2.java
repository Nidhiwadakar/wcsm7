package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com");

		//driver.findElement(By.xpath("")).sendKeys("Nidhi");

		//driver.findElement(By.xpath("")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone or email')]")).click();
		
	}

}
