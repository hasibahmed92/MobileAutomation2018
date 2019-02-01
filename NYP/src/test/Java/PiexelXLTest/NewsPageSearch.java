package PiexelXLTest;

import newsPage.NewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageSearch extends NewsPage {
    NewsPage newsPage;
    @BeforeMethod
    public void initElements(){
        newsPage = PageFactory.initElements(ad, NewsPage.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        newsPage.showNews();
    }
    @Test
    public void metroTest2() throws InterruptedException {
        newsPage.showSecondArt();
    }
    @Test
    public void metroTest3() throws InterruptedException {
        newsPage.showThirdArt();
    }
    @Test
    public void metroTest4() throws InterruptedException {
        newsPage.showFourthArt();
    }
    @Test
    public void metroTest5() throws InterruptedException {
        newsPage.showFifthArt();
    }
}
