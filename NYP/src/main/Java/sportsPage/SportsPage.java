package sportsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SportsPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    public static WebElement sports;

    public void showSports() throws InterruptedException {
        menu.click();
        sports.click();
        sleep(2);
        scrollAndClickByName("Kyrie Irving just gave Knicks the hope they were waiting for");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Kyrie Irving just gave Knicks the hope they were waiting for";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        sports.click();
        sleep(4);
        scrollAndClickByName("Gio Gonzalez could be next piece to Mets’ overhaul");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Gio Gonzalez could be next piece to Mets’ overhaul";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        sports.click();
        sleep(4);
        scrollAndClickByName("Knicks weren’t going to let Kristaps Porzingis leave on his terms");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Knicks weren’t going to let Kristaps Porzingis leave on his terms";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        sports.click();
        sleep(2);
        scrollAndClickByName("The end of baseball’s most unlikely friendship");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "The end of baseball’s most unlikely friendship";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        sports.click();
        sleep(2);
        scrollAndClickByName("Lindsey Vonn retiring with body ‘broken beyond repair’");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Lindsey Vonn retiring with body ‘broken beyond repair’";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}

