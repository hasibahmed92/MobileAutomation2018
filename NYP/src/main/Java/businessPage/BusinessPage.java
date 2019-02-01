package businessPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BusinessPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
    public static WebElement business;

    public void showNews() throws InterruptedException {
        menu.click();
        business.click();
        sleep(2);
        scrollAndClickByName("Anheuser-Busch to promote vintage brands at Super Bowl");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Anheuser-Busch to promote vintage brands at Super Bowl";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        business.click();
        sleep(4);
        scrollAndClickByName("US added 304K jobs last month despite record-long government shutdown");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "US added 304K jobs last month despite record-long government shutdown";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        business.click();
        sleep(4);
        scrollAndClickByName("OxyContin maker had secret plan to sell opioid treatment drugs: court docs");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "OxyContin maker had secret plan to sell opioid treatment drugs: court docs";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        business.click();
        sleep(2);
        scrollAndClickByName("Starbucks is scrambling to distance itself from Howard Schultz");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Starbucks is scrambling to distance itself from Howard Schultz";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        business.click();
        sleep(2);
        scrollAndClickByName("Columbia prof’s ties to payday lenders cloud CFPB rollback");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Columbia prof’s ties to payday lenders cloud CFPB rollback";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
