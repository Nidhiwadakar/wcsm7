package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private static final WebElement loginBtn = null;
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginpage;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keeplogesinchekboxuntililogout;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement clocklogo;
	@FindBy(id="licenseLink") private WebElement licenseforusingthissoftware ;
	
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginpage() {
		return loginpage;
	}
	public WebElement getKeeplogesinchekboxuntililogout() {
		return keeplogesinchekboxuntililogout;
	}
	public WebElement getClocklogo() {
		return clocklogo;
	}
	public WebElement getLicenseforusingthissoftware() {
		return licenseforusingthissoftware;
	}
	
	
	//generic reusable method
	
	public void actiTimevalidLogin(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();
		
	}
	
		
		
	}
	
	
	


