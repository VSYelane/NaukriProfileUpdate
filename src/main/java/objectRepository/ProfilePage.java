package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage { //Rule 1: Create POM class for every web page
			
			//Rule 2: Identify the WebElemets - Declaration
	       @FindBy(id = "login_Layer")
	       private WebElement homepageloginbtn;
	
	
			@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
			private WebElement usernameEdt;
			
			@FindBy(xpath = "//input[@type='password']")
			private WebElement passwordEdt;
			
			@FindBy(xpath = "//button[@type='submit']")
			private WebElement loginBtn;
			
			@FindBy(xpath = "//div[@Class='nI-gNb-drawer__icon']")
			private WebElement userProfile;
			
			@FindBy(xpath = "//a[text()='View & Update Profile']")
			private WebElement viewUpdateProfile;
			
			@FindBy(xpath = "//em[@class='icon edit ']")
			private WebElement editProfile;
			
			
		    @FindBy(xpath = "//span[text()='1 Month']") 
		    private WebElement editNoticePeriod1;
		    
		    @FindBy(xpath = "//span[text()='15 Days or less']") 
		    private WebElement editNoticePeriod2;
			  
		    @FindBy(id = "saveBasicDetailsBtn") 
		    private WebElement saveBtn;
		    
		    @FindBy(xpath="//a[@title='Logout']")
		    private WebElement logout;
			 
		
			//Rule 3: Initialization
			public ProfilePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//Rule 4: Utilization
			
			public WebElement getHomePageLoginBtn() {
				return homepageloginbtn;
			}

			public WebElement getUsernameEdt() {
				return usernameEdt;
			}

			public WebElement getPasswordEdt() {
				return passwordEdt;
			}

			public WebElement getLoginBtn() {
				return loginBtn;
			}
			
			public WebElement getUserProfile() {
				return userProfile;
				
			}
			
			public WebElement getViewUpdateProfile() {
				return viewUpdateProfile;
				
			}
			
			public WebElement getEditProfile() {
				return editProfile;
				
			}
			
			public WebElement getEditNoticePeriod1() {
				return editNoticePeriod1;
			
			}
			
			public WebElement getEditNoticePeriod2() {
				return editNoticePeriod2;
			
			}
			
			public WebElement getSaveBtn() {
			return saveBtn;
			}
			
			public WebElement getLogout() {
				return logout;
				
			}
			
		
			
			
			// Rule 5: Business Library - generic method but related to scenario
			/**
			 * This method will perform login operation via optimization
			 * 
			 */
			
			public void loginToApp(String USERNAME, String PASSWORD) {
				homepageloginbtn.click();
				usernameEdt.sendKeys(USERNAME);
				passwordEdt.sendKeys(PASSWORD);
				loginBtn.click();
				userProfile.click();
				viewUpdateProfile.click();
				editProfile.click();
				editNoticePeriod1.click();
				editNoticePeriod2.click();
				saveBtn.click();	
				userProfile.click();
				logout.click();
				
			}
			

		
	}
