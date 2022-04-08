package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebLoginPage {
    public WebDriver driver;

    public WebLoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(name = "login")
    WebElement enter;



    // Actions
    public void logInWeb(String ema, String passw){
        email.sendKeys(ema);
        password.sendKeys(passw);
    }

    public void clickEnter(){
        enter.click();
    }


}
