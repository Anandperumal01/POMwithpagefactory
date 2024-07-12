package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignupPage;

public class RegisterUser {
	
	private WebDriver driver;
	private HomePage homePage;
	private SignupPage signupPage;
	
	
	
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		homePage =new HomePage(driver);
		signupPage =new SignupPage(driver);
		
	
		
		
	}
	@Test
	public void testRegisteruser() throws InterruptedException {
		///Verify  the  home  page is visible Success fully
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		
		// click on signup link
		homePage.clickSignupLogin();
		
		//  verify  'Nnew  User signnup!'   is visible
		Assert.assertTrue(signupPage.isNewuserSignupVisible());
		
		// Enter name and email address
		signupPage.enterName("tester7888888");
		signupPage.enterEmailAddress("tester7888888@gmail.com");
		signupPage.clickSignup();
		//()=>System.out.pritnln("hello");
		
		Thread.sleep(5000);
		
		driver.close();
		
		;
		
		
		
		
		
	}

}
