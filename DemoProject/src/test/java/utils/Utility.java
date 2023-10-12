package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.WebTestBase;
import io.netty.handler.codec.http.Cookie;

public class Utility extends WebTestBase  {
	
	
	public static void scrollDownByElement(WebDriver driver, WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
        
	}
   
	public static void clickOk() {
		Alert a1=driver.switchTo().alert();
		a1.accept();
	}

	public static void switchToWindows(WebDriver driver) {

        String parentWindows = driver.getWindowHandle();

        Set<String> allWindow = driver.getWindowHandles();

        for (String s : allWindow) {

            if (!parentWindows.contentEquals(s)) {

                driver.switchTo().window(s);

                driver.close();

            }

            driver.switchTo().window(parentWindows);

        }

    }

	public static void screenShot(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\7000029144\\Pictures\\Screenshots\\Test.png");
		FileUtils.copyFile(source,des);
		
		
	}

	public Utility(){
        PageFactory.initElements(driver, this);
	}
	
	
}
