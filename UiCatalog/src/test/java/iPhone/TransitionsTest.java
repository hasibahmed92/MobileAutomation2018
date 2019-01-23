package iPhone;

import TransitionsPage.Transitions;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TransitionsTest extends Transitions{
    public Transitions transitions(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTransitions();
        return PageFactory.initElements(ad, Transitions.class);
    }
    @Test
    public void imageTest() throws InterruptedException {
        transitions().flipImage();
    }
    @Test
    public void tintedTest() throws InterruptedException {
        transitions().curlImage();
    }
}
