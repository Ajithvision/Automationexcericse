package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.WebTestBase;

public class LoginPage extends WebTestBase {

@FindBy(xpath ="//a[text()=' Signup / Login']")
WebElement login;

@FindBy(xpath="//input[@data-qa='login-email']")
WebElement email;

@FindBy(name="password")
WebElement pass;

@FindBy(xpath="//button[@data-qa='login-button']")
WebElement loginbtn;


 
public LoginPage() {

PageFactory.initElements(driver, this);

}
public void Loginpage() {
login.click();
email.sendKeys("ajithvision11@gmail.com");
pass.sendKeys("Sony@123456789");
loginbtn.click();


}
public boolean isUsernameFieldDisplayed() {
	// TODO Auto-generated method stub
	return false;
}
public boolean isPasswordFieldDisplayed() {
	// TODO Auto-generated method stub
	return false;
}
public boolean isLoginButtonDisplayed() {
	// TODO Auto-generated method stub
	return false;
}
public void login(String string, String string2) {
	// TODO Auto-generated method stub
	
}
public boolean isUserLoggedIn() {
	// TODO Auto-generated method stub
	return false;
}
public void goToLoginPage() {
	// TODO Auto-generated method stub
	
}
}