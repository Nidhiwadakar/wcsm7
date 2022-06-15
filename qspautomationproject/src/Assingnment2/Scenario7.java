package Assingnment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://bluestone.com");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

		WebElement targetToMouseHover = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();

		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		Thread.sleep(4000);

		 driver.findElement(By.xpath("//img[@alt='The Jinesh Kada For Him']")).click();
		 //driver.switchTo().frame("//input[@id='buy-now']");
	     
			
			 driver.findElement(By.linkText("//input[@id='buy-now']")).click();
			Thread.sleep(4000);
			
		
		
		 










	}

}
