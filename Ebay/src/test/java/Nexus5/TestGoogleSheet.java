package Nexus5;

import googleSheet.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestGoogleSheet extends GoogleSheetPage {

    GoogleSheetPage googleSheetsPage;
    @Test
    public void searchGoogleSheet() throws IOException, InterruptedException {
        googleSheetsPage = PageFactory.initElements(ad, GoogleSheetPage.class);
        googleSheetsPage.testGoogleSheet();

    }
}