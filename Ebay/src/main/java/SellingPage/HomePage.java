package SellingPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {


    @FindBy (className = "android.widget.TextView")
    public WebElement sellingTab;

    public void setSellingTab(){
        sellingTab.click();
    }
}