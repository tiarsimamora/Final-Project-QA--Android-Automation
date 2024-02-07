package MobileAutomation.PageObjectModel;

import MobileAutomation.AutomationBase.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BaseTest {
    By checkLabel = AppiumBy.id("com.rajawali.app:id/txt_flight");
    By radioButtonMr = AppiumBy.id("com.rajawali.app:id/radio_button_mr");
    By inputName = AppiumBy.id("com.rajawali.app:id/et_full_name");
    By inputPhoneNumber = AppiumBy.id("com.rajawali.app:id/et_phone");
    By inputEmail = AppiumBy.id("com.rajawali.app:id/et_email");
    By switchDetail = AppiumBy.id("com.rajawali.app:id/btn_switch");
    By nextButton = AppiumBy.id("com.rajawali.app:id/btn_next_page");
    By contPayment = AppiumBy.id("com.rajawali.app:id/btn_continue_to_payment");

    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(checkLabel));
    }

    public void selectGender() {
        driver.findElement(radioButtonMr).click();
    }

    public void fillForm(String fullNames, String phoneNumber, String email) {
        driver.findElement(inputName).sendKeys(fullNames);
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        driver.findElement(inputEmail).sendKeys(email);
    }


    public void passengerDetails() {
        driver.findElement(switchDetail).click();
    }

    public void processToCheckout(){
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Next\"))")));
        driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.rajawali.app:id/txt_flight")));
    }

    public void continueToPayment() {
        driver.findElement(contPayment).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(contPayment));
    }

}
