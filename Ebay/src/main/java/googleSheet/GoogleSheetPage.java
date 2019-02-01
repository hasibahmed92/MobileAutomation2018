package googleSheet;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends Base {

    @FindBy(id = "com.ebay.mobile:id/search_box")
    public static WebElement searchButton;
    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")
    public static WebElement input;
    String spreadsheetId = "1xQRqC1j2dRxIsKwJD8DdQJNevuEv4u7ndn9iPBqmoWc";
    String range = "Sheet1!A2:Z1000";
    public void clickSearchButton() throws InterruptedException {
       searchButton.click();
    }
    public List<List<Object>> getSpreadSheetRecords() throws IOException, InterruptedException {
        Sheets service = getSheetsService();
        System.out.println(service);
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();System.out.println(response);
        System.out.println(response);
        List<List<Object>> values = response.getValues();
        System.out.println(values);
        return values;
    }
    public List<String> searchItems() throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords();
        System.out.println(col2Value);
        List<String> actual = new ArrayList<String>();
        for (List row : col2Value) {
            inputValueInTextBoxByWebElement(input, row.get(0).toString());
            clearInputBox(input);
            System.out.println(row);
        }
        return actual;
    }
    public List<String> searchItems1() throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords();
        System.out.println(col2Value);
        List<String> expected = new ArrayList<String>();
        for (List row : col2Value) {
            inputValueInTextBoxByWebElement(input, row.get(0).toString());
            clearInputBox(input);
            System.out.println(row);
        }
        return expected;
    }
    public void testGoogleSheet() throws InterruptedException, IOException {
        clickSearchButton();
        List<String> actual = searchItems();
        List<String> expected = searchItems1();
        Assert.assertEquals(actual, expected);
    }
}