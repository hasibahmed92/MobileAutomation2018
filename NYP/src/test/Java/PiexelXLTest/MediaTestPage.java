package PiexelXLTest;

import mediaPage.MediaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MediaTestPage extends MediaPage {
    MediaPage mediaPage = null;
    @BeforeMethod
    public void initElements(){
        mediaPage = PageFactory.initElements(ad, MediaPage.class);
    }
    @Test
    public void mediaTest1() throws InterruptedException {
        mediaPage.showMedia();
    }
    @Test
    public void mediaTest2() throws InterruptedException {
        mediaPage.showSecondArt();
    }
    @Test
    public void mediaTest3() throws InterruptedException {
        mediaPage.showThirdArt();
    }
    @Test
    public void mediaTest4() throws InterruptedException {
        mediaPage.showFourthArt();
    }
    @Test
    public void mediaTest5() throws InterruptedException {
        mediaPage.showFifthArt();
    }
}
