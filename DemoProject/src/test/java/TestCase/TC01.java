package TestCase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Pages.ContactPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.VideoPage;
import Pages.ProductPage;
import TestBase.WebTestBase;

public class TC01 extends WebTestBase {
	
		LoginPage loginPage;
		Homepage homePage;
		VideoPage myAccountPage;
		ProductPage productpage;
		 VideoPage videopage;
		 ContactPage contactpage;
			public TC01() {
				super();
			}
		
@BeforeMethod
	public void BeforeMethod() {
	initialization();
	loginPage=new LoginPage();
	homePage=new Homepage();
	productpage=new ProductPage();
	videopage=new  VideoPage();
	contactpage=new ContactPage();
	
	}
	
	@Test(priority=0)
public void VerifyLogin() {
		
		SoftAssert softAssert = new SoftAssert();
		loginPage.Loginpage();
	     softAssert.assertAll();
	
}
	@Test(priority=1)
	public void ProductDetails() {
		SoftAssert softAssert = new SoftAssert();
		productpage.searchProduct();
		softAssert.assertAll();
		
	}
	@Test(priority=2)
	public void ViewProduct1() {
		SoftAssert softAssert = new SoftAssert();
		productpage.viewProducts1();
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void placeorder() throws InterruptedException {
		SoftAssert softAssert=new SoftAssert();
		productpage.viewProducts1();
		productpage.placeorder();
		
		
	}
	
	@Test(priority=4)
	public void ViewContact() {
		SoftAssert softAssert = new SoftAssert();
		contactpage.contactUs();
		softAssert.assertAll();
		
	}
	@Test(priority=5)
	public void ViewVideo() throws InterruptedException{
	SoftAssert softAssert = new SoftAssert();
	videopage.viewTutorial();
	softAssert.assertAll();
	Thread.sleep(2000);
		
	}

	@Test(priority=6)
	public void windowHandle() {
		
		SoftAssert softAssert =new SoftAssert();
		videopage.WindowHandle();
		
	}
@Test(priority=7)
public void screenShot() throws IOException {
	SoftAssert softAssert=new SoftAssert();
	productpage.TakeScreenshot();
	softAssert.assertAll();
	
}


	
}


	


	

		
	
	
