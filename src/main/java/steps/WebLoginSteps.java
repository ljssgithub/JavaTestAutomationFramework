package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.WebLoginPage;

import java.util.concurrent.TimeUnit;


public class WebLoginSteps {

    WebDriver driver = null;
    WebLoginPage webLoginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://pt-br.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webLoginPage = new WebLoginPage(driver);

    }

    @When("user types email {string} and password {string}")
    public void userTypesEmailAndPassword(String str1, String str2) {
        webLoginPage.logInWeb(str1,str2);


    }

    @And("clicks on enter button")
    public void clicksOnEnterButton() {
        webLoginPage.clickEnter();
    }

    @Then("System should show an error message")
    public void systemShouldShowAnErrorMessage() {
    }

    @After("@web")
    public void KillDriver(){
        driver.close();
    }
}
