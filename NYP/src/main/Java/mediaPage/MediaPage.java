package mediaPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MediaPage extends Base {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[11]")
    public static WebElement media;

    public void showMedia() throws InterruptedException {
        menu.click();
        media.click();
        sleep(2);
        scrollAndClickByName("US court orders Syria to pay $300M for death of journalist Marie Colvin");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "US court orders Syria to pay $300M for death of journalist Marie Colvin";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
       menu.click();
       media.click();
       sleep(2);
        scrollAndClickByName("AG Letitia James: Selling fake social media engagement is illegal");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "AG Letitia James: Selling fake social media engagement is illegal";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        media.click();
        sleep(2);
        scrollAndClickByName("‘Frat boy’ Gawker owner ups bid for Gizmodo, Deadspin");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "‘Frat boy’ Gawker owner ups bid for Gizmodo, Deadspin";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        media.click();
        sleep(2);
        scrollAndClickByName("Student who feels responsible for BuzzFeed layoffs gets job offers");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Student who feels responsible for BuzzFeed layoffs gets job offers";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        media.click();
        sleep(2);
        scrollAndClickByName("Netflix sued for copyright infringement over ‘Wild Wild Country’ documentary");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Netflix sued for copyright infringement over ‘Wild Wild Country’ documentary";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
