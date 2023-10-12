package Pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.WebTestBase;
import utils.Utility;

public class ProductPage extends WebTestBase{
	
	@FindBy(id="dismiss-button")
	WebElement adclose;

	@FindBy(xpath ="//a[text()=' Products']")
	WebElement product;

	@FindBy(id="search_product")
	WebElement search;

	
	@FindBy(id="submit_search")
	WebElement searchbtn;

	
	@FindBy(xpath ="//a[@href='/product_details/43']")
	WebElement viewproduct;
	
	@FindBy(xpath="//button[@class='btn btn-default cart']")
	WebElement addcart; 
	
	@FindBy(xpath="//a/u[text()='View Cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	WebElement Placeorder;
	
	 @FindBy(xpath="//u[text()='Register / Login']")
  	WebElement Login;

	public ProductPage() {

		PageFactory.initElements(driver, this);

}

	
	public void searchProduct() {
  
	product.click();
	search.sendKeys("shirt");
	searchbtn.click();
	}
	public void viewProducts1() {
	Utility.scrollDownByElement(driver, viewproduct);
	viewproduct.click();
	addcart.click();
	viewcart.click();
	}
	public void TakeScreenshot() throws IOException {
		product.click();
		Utility.screenShot(driver);
		
			
	}
	
	public void placeorder() throws InterruptedException {
		Placeorder.click();
	
			 
			/*String parentWindows = driver.getWindowHandle();
			
			System.out.println(parentWindows);

	        Set<String> allWindow = driver.getWindowHandles();
	        
	        for (String s : allWindow) {

	            if (!parentWindows.contentEquals(s)) {
	            	
	            	System.out.println(s);

	                driver.switchTo().window(s); 
	                
	         Thread.sleep(2000);*/
	               Login.click();
	               
	                
		}
	            
	            
	}
	
	
