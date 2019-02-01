package Nexus5;

import SellingPage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homePage;

    @BeforeMethod
    public void setUp(){
         homePage = PageFactory.initElements(ad, HomePage.class);
    }

    @Test
    public void test1() throws Exception {
        homePage.setSearch();
    }

}
