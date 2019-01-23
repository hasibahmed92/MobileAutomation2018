package TransitionsPage;

import common.Base;
import org.openqa.selenium.By;

public class Transitions extends Base {
    public void flipImage(){
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Flip Image\"]")).getText();
        String Expected = "Flip Image";
        System.out.println(Actual);
    }
    public void curlImage() {
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Curl Image\"]")).getText();
        String Expected = "Curl Image";
        System.out.println(Actual);
    }
}
