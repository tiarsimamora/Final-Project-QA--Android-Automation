package MobileAutomation.StepDefinition;

import MobileAutomation.PageObjectModel.CheckoutPage;
import MobileAutomation.PageObjectModel.HomePage;
import MobileAutomation.PageObjectModel.SearchPage;
import MobileAutomation.PageObjectModel.TicketPage;
import MobileAutomation.PageObjectModel.LoginPage;
import MobileAutomation.AutomationBase.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest{
    SearchPage searchPage = new SearchPage();
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    TicketPage ticketPage = new TicketPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on splash screen")
    public void userIsOnSplashPage() {
        loginPage.validateOnSplashPage();
    }

    @And("user click next on splash screen")
    public void userClickNext() {
        loginPage.splashClick();
    }
    @When("user fill login form with {string}, {string}")
    public void userFillForm(String email, String password) {
        loginPage.inputForm(email, password);
    }

    @And("user click the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("user should be directed to homepage")
    public void successLogin() {
        homePage.validateOnPage();
    }

    @Then("user should not be logged in")
    public void unsuccessLogin() {
        loginPage.validateOnLoginPage();
    }
}
