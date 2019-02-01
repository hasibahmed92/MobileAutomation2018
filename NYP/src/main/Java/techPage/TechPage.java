package techPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TechPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[12]")
    public static WebElement tech;
    @FindBy(id = "br.com.golmobile.nypost:id/headline_text_view")
    public static WebElement headline;
    @FindBy(className = "android.widget.TextView")
    public static WebElement secondArt;

    public void setTech() throws InterruptedException {
        menu.click();
        sleep(2);
        tech.click();
        sleep(2);
        scrollAndClickByName("Security expert: Facebook’s response to privacy scandal is bogus");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Security expert: Facebook’s response to privacy scandal is bogus";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showHeadline() throws InterruptedException {
        menu.click();
        tech.click();
        headline.click();
        sleep(2);
        scrollAndClickByName("Apple says FaceTime spying bug won’t be fixed until next week");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Apple says FaceTime spying bug won’t be fixed until next week";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        tech.click();
        secondArt.click();
        sleep(2);
        scrollAndClickByName("Scientists use Hubble telescope to create the deepest space image ever");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Scientists use Hubble telescope to create the deepest space image ever";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
