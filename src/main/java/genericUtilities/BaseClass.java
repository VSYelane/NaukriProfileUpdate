package genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectRepository.ProfilePage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtil = new FileUtility();
	public SeleniumUtility sUtil = new SeleniumUtility();
	public JavaUtility jUtil = new JavaUtility();
	
	
	public void bcConfigB(/*String BValue*/) throws IOException {
		//use to launch the browser
		String URL = fUtil.readDataFromPropertyFile("url");
		driver= new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.addImplicitlyWait(driver);
		driver.get(URL);
		System.out.println("Browser Launch Successfully");
		
		
	}
	
	
	public void bmConfigB() throws IOException {
		String USERNAME = fUtil.readDataFromPropertyFile("username");
		String PASSWORD = fUtil.readDataFromPropertyFile("password");
		ProfilePage lp = new ProfilePage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("Login To App Successfully");
		
	}
	
		
	}
