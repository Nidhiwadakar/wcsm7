package pageobjectmodel2;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {
	
	public static void main(String [] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp(); //open the browser and launch the web applications
		Flib flib = new Flib();
		
		//read the data frome excel file by using generic reusable methods 
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		
		//perform login
		lp.actiTimevalidLogin(validUsername, validPassword);
		
		Thread.sleep(4000);
		
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
		

		
	}
	
	
	

}
