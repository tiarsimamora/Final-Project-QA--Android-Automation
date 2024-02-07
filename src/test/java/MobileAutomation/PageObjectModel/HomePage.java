package MobileAutomation.PageObjectModel;

import MobileAutomation.AutomationBase.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {
    By bookNowButton = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.Button");

    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.rajawali.app:id/tv_logo_label")));
    }

    public void clickBook() {
        driver.findElement(bookNowButton).click();
    }

}