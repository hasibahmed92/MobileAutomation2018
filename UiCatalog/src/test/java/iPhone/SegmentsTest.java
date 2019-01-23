package iPhone;

import AlertsPage.Alerts;
import SegmentsPage.Segments;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegmentsTest extends Segments {
    Segments segments;
    @BeforeMethod
    public void setUp(){
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void testSegments1() throws InterruptedException {
        segments.setUiSegmentControl();
    }
    @Test
    public void testSegments2() throws InterruptedException {
        segments.setUiSegmentControlStyleBar();
    }
    @Test
    public void testSegments3() throws InterruptedException {
        segments.setUiSegmentControlStyleBarTint();
    }
    @Test
    public void testSegments4() throws InterruptedException {
        segments.setUiSegmentcontrolStyleBarImage();
    }
    @Test
    public void testSegments5() throws InterruptedException {
        segments.setUiSegmentControlStyleBordered();
    }
}
