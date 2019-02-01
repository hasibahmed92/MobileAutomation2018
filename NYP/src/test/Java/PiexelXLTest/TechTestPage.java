package PiexelXLTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import techPage.TechPage;

public class TechTestPage extends TechPage {
    TechPage techPage = null;
    @BeforeMethod
    public void initElements() {
        techPage = PageFactory.initElements(ad,TechPage.class);
    }
    @Test
    public void techTest1()throws Exception{
        techPage.setTech();
    }
    @Test
    public void techTest2() throws InterruptedException {
        techPage.showHeadline();
    }
    @Test
    public void techTest3() throws InterruptedException {
        techPage.showSecondArt();
    }
}
