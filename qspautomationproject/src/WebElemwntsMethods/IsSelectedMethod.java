package WebElemwntsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://desktop-o7r6489/login.do");
		WebElement checkboxKeepMeLoggedin;
		WebElement status = checkboxKeepMeLoggedin = driver.findElement(By.id("keepLoggedInCheckBopx"));
		boolean status1 = checkboxKeepMeLoggedin.isSelected();
		System.out.println(status);
		Thread.sleep(3000);
		checkboxKeepMeLoggedin.click();
		boolean status2 = checkboxKeepMeLoggedin.isSelected();
		System.out.println(status2);


	}

}
