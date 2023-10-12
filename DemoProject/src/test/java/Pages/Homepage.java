package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.WebTestBase;

public class Homepage extends WebTestBase {
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/ul/li[1]/a")
	WebElement Home;
	
	@FindBy(xpath ="/html/body/section[1]/div/div/div/div/ol/li[1]")
	WebElement dot1;
	
	public void HomePage(){
 
        PageFactory.initElements(driver,this);
    }
    public void sliderClick() {
    	dot1.click();
    	
    }
	public void sliderClick1() {
		// TODO Auto-generated method stub
		
	} 
    	
    }

