package Assingnment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	      driver.get("https://bluestone.com/");
	      driver.findElement(By.id("denyBtn")).click();
	      
	    
	      WebElement targetToMouseHover = driver.findElement(By.xpath("  //a[.='Rings ']"));
			Actions act = new Actions(driver);
			act.moveToElement(targetToMouseHover).perform();
			
			driver.findElement(By.xpath("//a[.='Diamond']")).click();
			
			WebElement targetToMouseHover1 = driver.findElement(By.xpath("//span[.='Price']"));
			Actions act1 = new Actions(driver);
			act.moveToElement(targetToMouseHover1).perform();
			
			WebElement targetToMouseHover2 = driver.findElement(By.xpath("//span[.=' Popular ']"));
			Actions act2 = new Actions(driver);
			act.moveToElement(targetToMouseHover2).perform();
			
			driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
			
			
			
			
			
			
					
			
	      
	      
			
			
			
	      
	      

			
			
			

	      
	      

	}

}
