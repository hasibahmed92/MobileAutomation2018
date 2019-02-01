package newsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
    public static WebElement news;

    public void showNews() throws InterruptedException {
        menu.click();
        news.click();
        sleep(2);
        scrollAndClickByName("Ex-teacher accused of sex with student a no-show in court after joining Army");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Ex-teacher accused of sex with student a no-show in court after joining Army";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        news.click();
        sleep(4);
        scrollAndClickByName("Woman claims hospital left her Alzheimer’s-stricken mother stranded");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Woman claims hospital left her Alzheimer’s-stricken mother stranded";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        news.click();
        sleep(4);
        scrollAndClickByName("Sex assaults at US military academies jumped by 50 percent last year");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Sex assaults at US military academies jumped by 50 percent last year";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        news.click();
        sleep(2);
        scrollAndClickByName("Man’s nearly $1 million Super Bowl scam took down his own mom");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Man’s nearly $1 million Super Bowl scam took down his own mom";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        news.click();
        sleep(2);
        scrollAndClickByName("Fourth dolphin dies at Dolphinaris Arizona after struggling to breathe");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Fourth dolphin dies at Dolphinaris Arizona after struggling to breathe";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
