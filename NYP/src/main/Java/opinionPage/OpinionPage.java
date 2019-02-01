package opinionPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OpinionPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]")
    public static WebElement opinion;

    public void showOpinion() throws InterruptedException {
        menu.click();
        opinion.click();
        sleep(2);
        scrollAndClickByName("Does Gov. Cuomo really want congestion pricing to pass in NY?");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Does Gov. Cuomo really want congestion pricing to pass in NY?";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        opinion.click();
        sleep(4);
        scrollAndClickByName("With a deal like this, NYCHA residents had better start praying");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "With a deal like this, NYCHA residents had better start praying";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        opinion.click();
        sleep(4);
        scrollAndClickByName("The abortion debate: NY’s new law is about saving lives");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "The abortion debate: NY’s new law is about saving lives";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        opinion.click();
        sleep(2);
        scrollAndClickByName("The abortion debate: The RHA legalizes infanticide");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "The abortion debate: The RHA legalizes infanticide";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        opinion.click();
        sleep(2);
        scrollAndClickByName("The new war over required measles shots");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "The new war over required measles shots";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
