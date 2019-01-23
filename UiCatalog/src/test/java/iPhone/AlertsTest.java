package iPhone;

import AlertsPage.Alerts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends Alerts {
   Alerts alerts;
   @BeforeMethod
   public void setUp(){
       alerts = PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testShowSimple1() throws InterruptedException {
        alerts.showSimple();
    }
    @Test
    public void testShowSimple2() throws InterruptedException {
        alerts.showOkCancel();
    }
    @Test
    public void testShowSimple3() throws InterruptedException {
        alerts.showCustom();
    }
    @Test
    public void testShowSimple4() throws InterruptedException {
        alerts.showSimpleAlerts();
    }
}