package Nexus5;

import Home.SellingPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SellingPageTest extends SellingPage {
    SellingPage sellingPage;

    @BeforeMethod
    public void setUp(){
        sellingPage = PageFactory.initElements(ad, SellingPage.class);
    }

    @Test
    public void testMenu() throws InterruptedException {
//         sellingPage.skipLogin();
         sellingPage.clickGps();
         sellingPage.getMenu();
         sellingPage.getMenu();
    }
    @Test
    public void testYourPlaces() {
        sellingPage.getYourPlaces();
    }
    @Test
    public void testYourTimeline() {
        sellingPage.getYourTimeline();
    }
    @Test
    public void testYourCOntribution() {
        sellingPage.getYourContributions();
    }
    @Test
    public void testLocationSharing() {
        sellingPage.getLocationSharing();
    }
    @Test
    public void testStartDriving() {
        sellingPage.getStartDriving();
    }
    @Test
    public void testExplore() {
        sellingPage.getExplore();
    }
    @Test
    public void testTipsAndTricks() {
        sellingPage.getTipsAndTricks();
    }
    @Test
    public void testAddAMissingPlace() {
        sellingPage.getAddAMissingPlace();
    }
    @Test
    public void testSettings() {
        sellingPage.getSettings();
    }
    @Test
    public void testHelp() {
        sellingPage.getHelp();
    }
    @Test
    public void testSendFeedBack() {
        sellingPage.getSendFeedback();
    }
    @Test
    public void testTermsOfService() {
        sellingPage.getTermsOfServices();
    }
    @Test
    public void testSetHomeAddressInYourPlace() {
        sellingPage.setHomeAddressInYourPlaces();
    }
    @Test
    public void testMapTypeSatellite() {
        sellingPage.mapTypeSatellite();
    }
    @Test
    public void testMapTypeTerrain() {
        sellingPage.mapTypeTerrain();
    }
    @Test
    public void testStartDrivingTo() {
        sellingPage.startDriving();
    }
    @Test
    public void testSearch() {
        sellingPage.search();
    }
}