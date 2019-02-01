package PiexelXLTest;

import livingPage.LivingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LivingTest extends LivingPage {
    LivingPage livingPage;
    @BeforeMethod
    public void initElements(){
        livingPage = PageFactory.initElements(ad, LivingPage.class);
    }
    @Test
    public void livingTest1() throws InterruptedException {
        livingPage.showLiving();
    }
    @Test
    public void livingTest2() throws InterruptedException {
        livingPage.showSecondArt();
    }
    @Test
    public void livingTest3() throws InterruptedException {
        livingPage.showThirdArt();
    }
    @Test
    public void livingTest4() throws InterruptedException {
        livingPage.showFourthArt();
    }
    @Test
    public void livingTest5() throws InterruptedException {
        livingPage.showFifthArt();
    }
}