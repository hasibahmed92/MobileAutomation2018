package livingPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LivingPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[10]")
    public static WebElement living;

    public void showLiving() throws InterruptedException {
        menu.click();
        living.click();
        sleep(2);
        scrollAndClickByName("This ‘ping pong’ pill swells up in your stomach to detect cancer");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "This ‘ping pong’ pill swells up in your stomach to detect cancer";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        living.click();
        sleep(2);
        scrollAndClickByName("‘Mutant’ coyotes with piercing blue eyes stun scientists");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "‘Mutant’ coyotes with piercing blue eyes stun scientists";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        living.click();
        sleep(2);
        scrollAndClickByName("This is what happens when you’re freezing to death");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "This is what happens when you’re freezing to death";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        living.click();
        sleep(2);
        scrollAndClickByName("Disease-riddled mummy could be key to curing arthritis");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Disease-riddled mummy could be key to curing arthritis";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        living.click();
        sleep(2);
        scrollAndClickByName("Study finds malnutrition is ‘rampant’ in US hospitals");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Study finds malnutrition is ‘rampant’ in US hospitals";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
