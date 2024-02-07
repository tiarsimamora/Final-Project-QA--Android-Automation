package MobileAutomation.PageObjectModel;

import MobileAutomation.AutomationBase.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TicketPage extends BaseTest {
    By depSchedule = AppiumBy.id("com.rajawali.app:id/tv_departure_schedule_label");
    By selectedTicket = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.LinearLayout");
    By selectedFlightLabel = AppiumBy.id("com.rajawali.app:id/txt_flight");
    By selectEconomy = AppiumBy.id("com.rajawali.app:id/btn_select");

    public void validateOnTicketPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(depSchedule));
    }

    public void selectTicket() {
        driver.findElement(selectedTicket).click();
    }

    public void setSelectedTicket() {
        wait.until(ExpectedConditions.presenceOfElementLocated(selectedFlightLabel));
        driver.findElement(selectEconomy).click();
    }
}
