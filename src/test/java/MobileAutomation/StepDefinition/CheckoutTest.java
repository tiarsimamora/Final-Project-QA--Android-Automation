package MobileAutomation.StepDefinition;

import MobileAutomation.AutomationBase.BaseTest;
import MobileAutomation.PageObjectModel.CheckoutPage;
import MobileAutomation.PageObjectModel.HomePage;
import MobileAutomation.PageObjectModel.SearchPage;
import MobileAutomation.PageObjectModel.TicketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CheckoutTest extends BaseTest {
    SearchPage searchPage = new SearchPage();
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    TicketPage ticketPage = new TicketPage();

    @And("user click booknow button")
    public void userClickBookNow() {
        homePage.clickBook();
        searchPage.validateOnPage();
    }

    @And("user click deparature button")
    public void userClickDepart() {
        searchPage.selectDep();
    }
    @And("user input deparature with {string}")
    public void userInputDepartWith(String cityAirportDep) {
        searchPage.inputDep(cityAirportDep);
    }

    @And("user confirm depart location")
    public void userConfirmDepart() {
        searchPage.selectedCity();
    }

    @And("user click arrive button")
    public void userClickArrive() {
        searchPage.selectArr();
    }
    @And("user input arrive with {string}")
    public void userInputArriveWith(String cityAirportArr) {
        searchPage.inputArr(cityAirportArr);
    }

    @And("user confirm arrive location")
    public void userConfirmArr() {
        searchPage.selectedCity();
    }

    @And("user select deparature date")
    public void userSelectDate() {
        searchPage.inputDate();
    }

    @And("user select passenger")
    public void userSelectPassenger() {
        searchPage.addPassenger();
    }

    @And("user select cabin class")
    public void userSelectClass() {
        searchPage.chooseClass();
    }

    @And("user click on search flight button")
    public void userSearchFlight() {
        searchPage.searchFight();
    }

    @Then("user is on ticket page")
    public void userOnTicketPage() {
        ticketPage.validateOnTicketPage();
    }

    @When("user select a ticket")
    public void userSelectTicket() {
        ticketPage.selectTicket();
    }
    @And("user select ticket type")
    public void userSelectedTicket() {
        ticketPage.setSelectedTicket();
    }

    @And("user select gender")
    public void userSelectGender() {
        checkoutPage.selectGender();
    }

    @And("user fills out the form with {string}, {string}, {string}")
    public void userFillOutForm(String fullNames, String phoneNumber, String email) {
        checkoutPage.fillForm(fullNames, phoneNumber, email);
    }
    @And("user click on switch button for passenger details")
    public void userClickSwitch() {
        checkoutPage.passengerDetails();
    }

    @And("user click on next button")
    public void userClickNext() {
        checkoutPage.processToCheckout();
    }

    @Then("user click on continue to payment button")
    public void userClickContinue() {
        checkoutPage.continueToPayment();
    }

    @Given("user is on homepage")
    public void userIsOnHomePage() {
        homePage.validateOnPage();
    }

}
