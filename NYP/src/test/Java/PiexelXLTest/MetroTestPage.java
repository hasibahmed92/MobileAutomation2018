package PiexelXLTest;

import metroPage.MetroPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MetroTestPage extends MetroPage {
    MetroPage metroPage;
    @BeforeMethod
    public void initElements(){
        metroPage = PageFactory.initElements(ad, MetroPage.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        metroPage.showMetro();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        metroPage.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        metroPage.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        metroPage.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        metroPage.showFifthArt();
    }
}
