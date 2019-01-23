package iPhone;

import TextViewPage.TextView;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextViewTest extends TextView {
    TextView textView;
    @BeforeMethod
    public void setUp(){
        textView = PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void testButton1() throws InterruptedException {
        textView.setTextView();
    }
}
