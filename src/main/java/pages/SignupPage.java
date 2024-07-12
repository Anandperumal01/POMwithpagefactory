package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class SignupPage extends BasePage{
	
	/*private By newUserSignupText=By.xpath("//h2[normalize-space()='New User Signup!']");
	private By txtName=By.xpath("//input[@placeholder='Name']");
	private By txtEmailAddress=By.xpath("//input[@data-qa='signup-email']");
	private By btnSignup=By.xpath("//button[normalize-space()='Signup']");*/
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']") 
	WebElement newUserSignupText;
	
	@FindBy(xpath="//input[@placeholder='Name']") 
	WebElement txtName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']") 
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//button[normalize-space()='Signup']") 
	WebElement btnSignup;

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean isNewuserSignupVisible() {
		//return driver.findElement(newUserSignupText).isDisplayed();
		return newUserSignupText.isDisplayed();
	}
	
	public void enterName(String name) {
		//driver.findElement(txtName).sendKeys(name);
		txtName.sendKeys(name);
	}

	public void enterEmailAddress(String emailaddress) {
		//driver.findElement(txtEmailAddress).sendKeys(emailaddress);
		txtEmailAddress.sendKeys(emailaddress);
	}

	public void clickSignup() {
		//driver.findElement(btnSignup).click();
		btnSignup.click();
	}
}
