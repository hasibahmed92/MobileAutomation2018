package excelReader;

import Util.ConnectToMongoDB;
import com.mongodb.client.MongoDatabase;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reader.ReadXls;

import java.util.ArrayList;
import java.util.List;

import static Util.ConnectToMongoDB.connectToMongoDB;

public class XssfReader extends Base {
    @FindBy(how = How.XPATH, xpath = "//com.google.android.apps.genie.geniewidget.agf[@content-desc=\"Top Stories\"]/android.widget.TextView")
    WebElement TOPSTORIES;
    @FindBy(xpath = "//com.google.android.apps.genie.geniewidget.agf[@content-desc=\"World\"]/android.widget.TextView")
    WebElement WORLD;
    @FindBy(xpath = "//com.google.android.apps.genie.geniewidget.agf[@content-desc=\"U.S.\"]/android.widget.TextView")
    WebElement US;
    @FindBy(xpath = "//com.google.android.apps.genie.geniewidget.agf[@content-desc=\"Business\"]/android.widget.TextView")
    WebElement BUSINESS;

    public List webElementList() {
        MongoDatabase mongoDatabase = connectToMongoDB();
        List<WebElement> webElements = new ArrayList<WebElement>();
        webElements.add(TOPSTORIES);
        webElements.add(WORLD);
        webElements.add(US);
        webElements.add(BUSINESS);

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < webElements.size(); i++) {
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    ReadXls xlData = new ReadXls("/Users/hasibahmed/IdeaProjects/MobileNov2018/GoogleNews/Data/Book1.xlsx");
    public List expectedWebElement() {
        int rowCount = xlData.getRowCount("Sheet3");
        List<String> expect = new ArrayList<String>();
        for (int i = 1; i <= rowCount; i++) {
            expect.add(xlData.getCellData("Sheet3", "TOP STORIES", i));
        }
        System.out.println(expect);
        return expect;
    }
}
