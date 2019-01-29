package Nexus5;

import SellingPage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage hp;

    @BeforeMethod
    public void setUp(){
         hp = PageFactory.initElements(ad, HomePage.class);
    }

    @Test
    public void testSellingButton(){
        hp.setSellingTab();
    }

}
