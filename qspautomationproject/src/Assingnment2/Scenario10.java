package Assingnment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {

	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	      driver.get("https://bluestone.com/");
	      
	      driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	      
	      driver.switchTo().frame("chat-widget");
	      
	      WebElement chatWithOurExperts = driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
			chatWithOurExperts.click();

	      
	     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nidhi");
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nidhiwadakar1912@gmail.com");
	      driver.findElement(By.xpath("//p[@id='react-aria-2669260211-11']")).sendKeys("8971067639");
	      
	      
	      
	      
	      
	      
			
			
	      
	      

	}

}
