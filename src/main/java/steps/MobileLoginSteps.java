package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MobileLoginPage;
import utils.Appium;

public class MobileLoginSteps {
    private WebDriver driver;
    MobileLoginPage mobileLoginPage = new MobileLoginPage();

    public MobileLoginSteps(){
        this.driver = Appium.getDriver();
    }

    @Given("User opens the application")
    public void userOpensTheApplication() {
        Assert.assertTrue(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Log In']")).isDisplayed());
    }

    @When("User types {string} in password and email {string}")
    public void userTypesInPasswordAndEmail(String em, String pa) {
        mobileLoginPage.logIn(em,pa);

    }

    @Then("System should show an alert that contains a ok button")
    public void systemShouldShowAnAlertThatContainsAOkButton() {
        mobileLoginPage.btnValidation();
    }

    @And("User clicks on Login")
    public void userClicksOnLogin() {
    }
}
