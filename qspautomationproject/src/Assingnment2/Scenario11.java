package Assingnment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://bluestone.com");
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		driver.findElement(By.xpath("//span[.='Offers ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Offers']"));
		WebElement targetToMouseHover = driver.findElement(By.xpath("	//span[text()='Offers']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		
		driver.findElement(By.xpath("//span[text()=' 10% Making Charge Off ']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		


	}

}
