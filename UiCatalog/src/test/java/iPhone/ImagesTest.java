package iPhone;

import ImagesPage.Images;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTest extends Images {

    Images images;
    @BeforeMethod
    public void setUp(){
        images = PageFactory.initElements(ad, Images.class);
    }
    @Test
    public void testButton1() throws InterruptedException {
        images.show();
    }
}
