package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLMethod {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=youtube&oq=youtube&aqs=chrome..69i57.5224j0j7&sourceid=chrome&ie=UTF-8");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
}

