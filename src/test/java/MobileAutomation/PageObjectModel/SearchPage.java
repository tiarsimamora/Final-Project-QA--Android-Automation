package MobileAutomation.PageObjectModel;

import MobileAutomation.AutomationBase.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import io.appium.java_client.touch.offset.PointOption;


public class SearchPage extends BaseTest {

    By fromTextBox = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout[1]");
    By searchPopUp = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
    By searchResult = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    By toTextBox = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout[2]");
    By depDate = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout");
    By calendar = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.GridView");
    By selectDate = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sunday, February 4\"]");
    By confirmDateButton = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]");
    By addAdult = AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Rajawali Air\"])[2]");
    By addChild = AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Rajawali Air\"])[4]");
    By addInfant = AppiumBy.xpath("(//android.widget.ImageButton[@content-desc=\"Rajawali Air\"])[6]");
    By economyClass = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]");
    By businessClass = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]");
    By firstClass = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]");
    By doneClassButton = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]");
    By passengerAndClass = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout[4]");
    By searchFlightBtn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.Button");


    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(fromTextBox));
        wait.until(ExpectedConditions.presenceOfElementLocated(toTextBox));
        wait.until(ExpectedConditions.presenceOfElementLocated(depDate));
    }

    public void selectDep(){
        driver.findElement(fromTextBox).click();
    }

    public void selectArr(){
        driver.findElement(toTextBox).click();
    }
    public void inputDep(String cityAirportDep) {
        driver.findElement(searchPopUp).sendKeys(cityAirportDep);
    }

    public void selectedCity() {
        wait.until(ExpectedConditions.presenceOfElementLocated(searchResult));
        driver.findElement(searchResult).click();
    }

    public void inputArr(String cityAirportArr) {
        driver.findElement(searchPopUp).sendKeys(cityAirportArr);
    }

    public void inputDate() {
        driver.findElement(depDate).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(calendar));
        driver.findElement(selectDate).click();
        driver.findElement(confirmDateButton).click();
    }

    public void addPassenger(){

        driver.findElement(passengerAndClass).click();
        driver.findElement(addAdult).click();

    }

    public void chooseClass(){
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Done\"))")));
        driver.findElement(economyClass).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(doneClassButton));
        driver.findElement(doneClassButton).click();
    }

    public void searchFight(){
        driver.findElement(searchFlightBtn).click();
    }




}
