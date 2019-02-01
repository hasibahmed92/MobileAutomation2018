package fashionPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FashionPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]")
    public static WebElement fashion;

    public void showFashion() throws InterruptedException {
        menu.click();
        fashion.click();
        sleep(2);
        scrollAndClickByName("Transgender model collaborates with UK lingerie line after Victoria’s Secret ban");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Transgender model collaborates with UK lingerie line after Victoria’s Secret ban";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSecondArt() throws InterruptedException {
        menu.click();
        fashion.click();
        sleep(2);
        scrollAndClickByName("This Eddie Bauer suit is the hot way to beat the polar vortex");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "This Eddie Bauer suit is the hot way to beat the polar vortex";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showThirdArt() throws InterruptedException {
        menu.click();
        fashion.click();
        sleep(2);
        scrollAndClickByName("Jameela Jamil, Busy Philipps and Samira Wiley pose unretouched for Aerie");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Jameela Jamil, Busy Philipps and Samira Wiley pose unretouched for Aerie";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFourthArt() throws InterruptedException {
        menu.click();
        fashion.click();
        sleep(2);
        scrollAndClickByName("Cara Delevingne channels Janet Jackson in topless Balmain campaign");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Cara Delevingne channels Janet Jackson in topless Balmain campaign";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showFifthArt() throws InterruptedException {
        menu.click();
        fashion.click();
        sleep(2);
        scrollAndClickByName("Iris Apfel, 97, signs with IMG Models");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Iris Apfel, 97, signs with IMG Models";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }


}
