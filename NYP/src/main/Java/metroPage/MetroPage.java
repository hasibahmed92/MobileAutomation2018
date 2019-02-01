package metroPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MetroPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]")
    public static WebElement metro;

    public void showMetro() throws InterruptedException {
        menu.click();
        metro.click();
        sleep(2);
        scrollAndClickByName("Alleged hammer attacker charged with killing three inside restaurant");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Alleged hammer attacker charged with killing three inside restaurant";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        metro.click();
        sleep(2);
        scrollAndClickByName("Lynne Patton takes swipe at Bill de Blasio over NYCHA deal");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Lynne Patton takes swipe at Bill de Blasio over NYCHA deal";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        metro.click();
        sleep(2);
        scrollAndClickByName("Former aide to Clinton and Obama heats up public advocate race");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Former aide to Clinton and Obama heats up public advocate race";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        metro.click();
        sleep(2);
        scrollAndClickByName("Detention center in Brooklyn without heat and power for past week");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Detention center in Brooklyn without heat and power for past week";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        metro.click();
        sleep(2);
        scrollAndClickByName("Suspect in UWS home invasion is a homeless man on parole: cops");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Suspect in UWS home invasion is a homeless man on parole: cops";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }


}
