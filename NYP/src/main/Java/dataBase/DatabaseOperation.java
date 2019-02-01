package dataBase;

import Util.ConnectToSqlDB;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation extends Base {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "newsList", "LatestStories");
    }
    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<String>();
        headerList.add("News");
        headerList.add("Metro");
        headerList.add("Page Six");
        headerList.add("Sports");
        headerList.add("Business");
        headerList.add("Opinion");
        return headerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("newsList", "LatestStories");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    WebElement Menu;
    @FindBy(how = How.XPATH, xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
    WebElement News;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]")
    WebElement Metro;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]")
    WebElement PageSix;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    WebElement Sports;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
    WebElement Business;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]")
    WebElement Opinion;

    public List getHeadersValue1() {
        Menu.click();
        List<WebElement> headerList1 = new ArrayList<WebElement>();
        headerList1.add(News);
        headerList1.add(Metro);
        headerList1.add(PageSix);
        headerList1.add(Sports);
        headerList1.add(Business);
        headerList1.add(Opinion);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("newsList", "LatestStories");
        for (String st : list) {
            System.out.println(st);
        }
    }
}