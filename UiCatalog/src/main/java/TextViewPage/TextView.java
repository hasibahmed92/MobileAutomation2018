package TextViewPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextView extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]")
    public static WebElement textView;
    public void setTextView(){
        textView.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView")).getAttribute("value");
        String Expected = "Now is the time for all good developers to come to serve their country. Now is the time for all good developers to come to serve their country. This text view can also use attributed strings.";
        System.out.println(Actual);
    }
}
