package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourcePageMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String sourceCodeOfTheWebPage = driver.getPageSource();
		System.out.println(sourceCodeOfTheWebPage);

	}

}
