package entertainmentPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EntertainmentPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]")
    public static WebElement entertainment;

    public void showEntertainment() throws InterruptedException {
        menu.click();
        entertainment.click();
        sleep(2);
        scrollAndClickByName("Enough with heart-tugging films about quirky, terminally ill teens");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Enough with heart-tugging films about quirky, terminally ill teens";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        entertainment.click();
        sleep(4);
        scrollAndClickByName("Women are ruling Hollywood with gender-swapping movie remakes");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Women are ruling Hollywood with gender-swapping movie remakes";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        entertainment.click();
        sleep(4);
        scrollAndClickByName("How true-life tales dominated the competition at Sundance");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "How true-life tales dominated the competition at Sundance";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        entertainment.click();
        sleep(2);
        scrollAndClickByName("These are the 3 rising stars of Sundance 2019");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "These are the 3 rising stars of Sundance 2019";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        entertainment.click();
        sleep(2);
        scrollAndClickByName("Zachary Levi hopes for return to ‘Marvelous Mrs. Maisel’");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Zachary Levi hopes for return to ‘Marvelous Mrs. Maisel’";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
