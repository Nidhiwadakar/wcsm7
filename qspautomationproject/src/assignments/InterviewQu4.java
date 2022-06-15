package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InterviewQu4 {

	public static void main(String[] args) throws InterruptedException {
		
		//How to close only the child browser

		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			
			driver.findElement(By.linkText("Open a popup window")).click();
            String parentHandle = driver.getWindowHandle();
			Set<String> allHandles = driver.getWindowHandles();

			for(String wh:allHandles)
			{
				if(!parentHandle.equals(wh))
				{
					Thread.sleep(2000);
					driver.switchTo().window(wh).close();
				}
				
				else
				{
					
				}

	}

}
}
