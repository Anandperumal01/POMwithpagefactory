package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePage extends BasePage{
	// 2. WebElements adding section
	//private By signupLoginButton=By.xpath("//a[normalize-space()='Signup / Login']");
    
	@FindBy(xpath="//a[normalize-space()='Signup / Login']") 
	WebElement signupLoginButton;
	// 1. constructor for the webdriver initalisation
	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	// 3.Actions
	public void clickSignupLogin() {
		//driver.findElement(signupLoginButton).click();
		signupLoginButton.click();
	}

}
