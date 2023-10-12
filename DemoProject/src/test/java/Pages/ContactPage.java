package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;
import utils.Utility;

public class ContactPage extends WebTestBase {
	
	@FindBy(xpath="//a[@href='/contact_us']")
	WebElement contact;
	
	@FindBy(name="name")
	WebElement namee;
	
	@FindBy(name="email")
	WebElement emaill;
	
	@FindBy(name="submit")
	WebElement submit;

	public ContactPage() {

	PageFactory.initElements(driver, this);

}

public void contactUs() {
	contact.click();
	namee.sendKeys("Ajith");
	emaill.sendKeys("ajith@gmail.com");
	submit.click();
	Utility.clickOk();
	
	
}

}