package PiexelXLTest;

import businessPage.BusinessPage;
import newsPage.NewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BusinessTest extends BusinessPage {
    BusinessTest businessTest;
    @BeforeMethod
    public void initElements(){
        businessTest = PageFactory.initElements(ad, BusinessTest.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        businessTest.showNews();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        businessTest.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        businessTest.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        businessTest.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        businessTest.showFifthArt();
    }
}