package PiexelXLTest;

import fashionPage.FashionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FashionTest extends FashionPage {
    FashionPage fashionPage;
    @BeforeMethod
    public void initElements(){
        fashionPage = PageFactory.initElements(ad, FashionPage.class);
    }
    @Test
    public void fashionTest1() throws InterruptedException {
        fashionPage.showFashion();
    }
    @Test
    public void fashionTest2() throws InterruptedException {
        fashionPage.showSecondArt();
    }
    @Test
    public void fashionTest3() throws InterruptedException {
        fashionPage.showThirdArt();
    }
    @Test
    public void fashionTest4() throws InterruptedException {
        fashionPage.showFourthArt();
    }
    @Test
    public void fashionTest5() throws InterruptedException {
        fashionPage.showFifthArt();
    }

}
