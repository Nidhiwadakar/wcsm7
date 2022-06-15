package methodsofwebdriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDimentionToBrowser {

	private static final org.openqa.selenium.Dimension Dimensin = null;

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 Dimension targetSize = new Dimension(450,250);
	 driver.manage().window().setSize(Dimensin);
	 
	}
	 
	

}
