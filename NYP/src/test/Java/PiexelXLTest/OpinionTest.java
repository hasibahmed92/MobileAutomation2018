package PiexelXLTest;

import opinionPage.OpinionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpinionTest extends OpinionPage {
    OpinionPage opinionPage;
    @BeforeMethod
    public void initElements(){
        opinionPage = PageFactory.initElements(ad, OpinionPage.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        opinionPage.showOpinion();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        opinionPage.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        opinionPage.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        opinionPage.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        opinionPage.showFifthArt();
    }
}