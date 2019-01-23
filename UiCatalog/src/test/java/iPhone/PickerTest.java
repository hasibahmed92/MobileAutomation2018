package iPhone;

import PickersPage.Picker;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PickerTest extends Picker{
    Picker picker;
    @BeforeMethod
    public void setUp(){
        picker = PageFactory.initElements(ad, Picker.class);
    }
    @Test
    public void testPicker1() throws InterruptedException {
        picker.showDate();
    }
    @Test
    public void testPicker2() throws InterruptedException {
        picker.showUI();
    }
    @Test
    public void testPicker3() throws InterruptedException {
        picker.showCustom1();
    }
//    String[] pickerName = {"Chris Armstrong","3"};
//    String[] pickerDate = {"March","10","2018"};
//    public Picker picker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        uiCatalog.getPickers();
//        return PageFactory.initElements(ad, Picker.class);
//    }
//    @Test
//    public void testUIPicker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        uiCatalog.getPickers();
//        Picker picker = PageFactory.initElements(ad, Picker.class);
//        picker().getUIPicker();//.selectPickerTwoWheels("Chris Armstrong","3");
//        scrollKeys(ad, pickerName,"//UIAPicker[1]");
//    }
//    //@Test
//    public void testDatePicker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        uiCatalog.getPickers();
//        Picker picker = PageFactory.initElements(ad, Picker.class);
//        picker().getUIDatePicker();
//        scrollKeys(ad, pickerDate,"//UIAPicker[2]");
//    }

}
