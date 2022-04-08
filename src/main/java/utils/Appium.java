package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Appium {
    public static AndroidDriver driver;

    @Before("@appium")
    public static void setUpAppium() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("app", "C:\\projects\\javaAutomationFramework\\src\\main\\resources\\apks\\facebook.apk");

        driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After("@appium")
    public void KillDriver(){
        driver.closeApp();
    }
}
