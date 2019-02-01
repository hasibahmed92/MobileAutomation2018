package PiexelXLTest;

import newsPage.NewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageSix.PageSix;

public class PageSixTest extends PageSix {
    PageSix pageSix;
    @BeforeMethod
    public void initElements(){
        pageSix = PageFactory.initElements(ad, PageSix.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        pageSix.showPageSix();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        pageSix.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        pageSix.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        pageSix.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        pageSix.showFifthArt();
    }
}