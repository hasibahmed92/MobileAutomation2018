package SellingPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends Base {


    @FindBy (id = "com.ebay.mobile:id/search_box")
    public WebElement search;
    @FindBy (id = "com.ebay.mobile:id/search_src_text")
    public WebElement enterSearch;

    public void setSearch() throws InterruptedException {
        search.click();
        enterSearch.sendKeys("doll", Keys.ENTER);
//        sleep(2);
//        String Actual = ad.findElement(By.id("com.ebay.mobile:id/textview_item_title")).getText();
//        String Expected = "22\" Handmade Reborn Doll Newborn Gift Lifelike Soft Vinyl Silicone Baby Dolls";
//        Assert.assertEquals(Actual, Expected);
//        System.out.println(Actual);
    }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")
    public static WebElement simple;
    public void showSimple(){
        search.click();
        simple.click();
        typeByIDEnter("com.ebay.mobile:id/search_box", "dolls");
        String Actual = ad.findElement(By.id("com.ebay.mobile:id/textview_item_title")).getText();
        String Expected = "22\" Handmade Reborn Doll Newborn Gift Lifelike Soft Vinyl Silicone Baby Dolls";
        System.out.println(Actual);
    }
}