package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;
import utils.Utility;

public class VideoPage extends WebTestBase {
	
	@FindBy(xpath="//a[text()=' Video Tutorials']")
	WebElement video;
	
	
	public VideoPage(){
        PageFactory.initElements(driver, this);
    }
	public void viewTutorial() {
		video.click();
		
	}
	
	public void WindowHandle() {
		video.click();

	Utility.switchToWindows(driver);
		
	}


}