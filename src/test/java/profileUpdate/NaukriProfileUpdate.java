package profileUpdate;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtilities.FileUtility;
import genericUtilities.SeleniumUtility;
import objectRepository.ProfilePage;
public class NaukriProfileUpdate {
	@Test
	public void TC_001_LoginToNaukri() throws IOException, InterruptedException{
		
		
		
		//Create Object of all Utilities
		SeleniumUtility sUtil = new SeleniumUtility();
		FileUtility fUtil = new FileUtility();
		
		//Read the Data from Files
		String URL = fUtil.readDataFromPropertyFile("url");
		String USERNAME = fUtil.readDataFromPropertyFile("username");
		String PASSWORD = fUtil.readDataFromPropertyFile("password");
		
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.addImplicitlyWait(driver);
		
//		//Load the app
		driver.get(URL);
		
//		//Login to App
		ProfilePage lp = new ProfilePage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		
		Thread.sleep(2000);
		driver.quit();

}
}
