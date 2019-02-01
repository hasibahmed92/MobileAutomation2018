package PiexelXLTest;

import entertainmentPage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntertainmentTest extends EntertainmentPage {
   EntertainmentPage entertainmentPage;
    @BeforeMethod
    public void initElements(){
        entertainmentPage = PageFactory.initElements(ad, EntertainmentPage.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        entertainmentPage.showEntertainment();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        entertainmentPage.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        entertainmentPage.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        entertainmentPage.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        entertainmentPage.showFifthArt();
    }
}
