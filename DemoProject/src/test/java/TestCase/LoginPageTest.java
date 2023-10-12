package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginPage;

public class LoginPageTest {
    @Test
    public void VerifyLogin() {
       
        SoftAssert softAssert = new SoftAssert();
      
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        Object actualRersult = null;
		Object expectedResult;
		softAssert.assertEquals(actualRersult,expectedResult(),"ajithvision11@gmail.com");
		softAssert.assertEquals(actualRersult,expectedResult(), "Sony@123456789.");
		softAssert.assertEquals(actualRersult,expectedResult(), "Login button is displayed.");

        loginPage.login("ajithvision11@gmail.com", "Sony@123456789");

        softAssert.assertEquals(actualRersult,expectedResult(), "User  logged in.");
      
        softAssert.assertAll();
    }

	private Object expectedResult() {
		// TODO Auto-generated method stub
		return null;
	}
}	


