package MobileAutomation.PageObjectModel;
import MobileAutomation.AutomationBase.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest{
    By splashButton = AppiumBy.id("com.rajawali.app:id/btn_next");
    By getStarted = AppiumBy.id("com.rajawali.app:id/btn_get_started");
    By emailInput = AppiumBy.id("com.rajawali.app:id/et_email");
    By passInput = AppiumBy.id("com.rajawali.app:id/et_password");
    By loginButton = AppiumBy.id("com.rajawali.app:id/btn_login");

    public void validateOnSplashPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(splashButton));
    }
    public void validateOnLoginPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }
    public void splashClick(){
        driver.findElement(splashButton).click();
        driver.findElement(splashButton).click();
        driver.findElement(splashButton).click();
        driver.findElement(getStarted).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void inputForm(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passInput).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

}
