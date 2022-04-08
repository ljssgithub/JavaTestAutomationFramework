package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utils.Appium.driver;

public class MobileLoginPage {

    public MobileLoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Username")
    public WebElement email;

    @AndroidFindBy(accessibility = "Password")
    public WebElement password;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Log In']")
    public WebElement login;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement btn;

    public void logIn(String pas, String ema){
        email.sendKeys(ema);
        password.sendKeys(pas);
        login.click();

    }

    public void btnValidation(){
        // Perform a click on the button ok.
        btn.click();
    }

}

