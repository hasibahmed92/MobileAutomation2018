package pageSix;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PageSix extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]")
    public static WebElement pageSix;

    public void showPageSix() throws InterruptedException {
        menu.click();
        pageSix.click();
        sleep(2);
        scrollAndClickByName("Tekashi 6ix9ine pleads guilty to 9 felonies, admits to involvement in Chief Keef shooting");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Tekashi 6ix9ine pleads guilty to 9 felonies, admits to involvement in Chief Keef shooting";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        pageSix.click();
        sleep(4);
        scrollAndClickByName("Jussie Smollett insists he’s been honest about attack");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Jussie Smollett insists he’s been honest about attack";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        pageSix.click();
        sleep(4);
        scrollAndClickByName("Wendy Williams’ hiatus continues as more guest hosts are named");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Wendy Williams’ hiatus continues as more guest hosts are named";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        pageSix.click();
        sleep(2);
        scrollAndClickByName("Roger Mathews responds to JWoww’s videos of alleged abuse");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Roger Mathews responds to JWoww’s videos of alleged abuse";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        pageSix.click();
        sleep(2);
        scrollAndClickByName("David Arquette parties in a bunny suit at Gucci Mane’s Super Bowl show");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "David Arquette parties in a bunny suit at Gucci Mane’s Super Bowl show";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
