package Assingnment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[.='Droppable']")).click();
	    driver.switchTo().frame("//div[@id='draggable']");
	    driver.findElement(By.xpath("//div[@id='draggable']")).click();
	    
	    WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));

		WebElement target = driver.findElement(By.xpath("//p[.='Drop here']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();


	    



	      
	      


}
}
