package PiexelXLTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sportsPage.SportsPage;

public class SportsTest extends SportsPage {
    SportsPage sportsPage;
    @BeforeMethod
    public void initElements(){
        sportsPage = PageFactory.initElements(ad, SportsPage.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        sportsPage.showSports();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        sportsPage.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        sportsPage.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        sportsPage.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        sportsPage.showFifthArt();
    }
}