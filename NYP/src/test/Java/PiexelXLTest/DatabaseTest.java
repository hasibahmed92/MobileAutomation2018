package PiexelXLTest;

import dataBase.DatabaseOperation;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;

public class DatabaseTest extends DatabaseOperation {
    DatabaseOperation databaseOperation;
    @BeforeMethod
    public void intializedElements(){
        databaseOperation = PageFactory.initElements(ad, DatabaseOperation.class);

    }
    @Test
    public void webElementName() throws Exception {
        List actual = databaseOperation.getUserDatafromDB();
        List expected = databaseOperation.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}