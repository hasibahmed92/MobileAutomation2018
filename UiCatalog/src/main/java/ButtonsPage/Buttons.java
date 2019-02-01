package ButtonsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public static WebElement buttons;
    public void showBackgroundImage(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Background Image\"]")).getText();
        String Expected = "Background Image";
        System.out.println(Actual);
    }
    public void showButtonWithImage() {
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Button with Image\"]")).getText();
        String Expected = "Button with Image";
        System.out.println(Actual);
    }
    public void showRoundedButton(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UIButtonTypeRoundedRect\"])[1]")).getText();
        String Expected = "UIButtonTypeRoundedRect";
        System.out.println(Actual);
    }
}
