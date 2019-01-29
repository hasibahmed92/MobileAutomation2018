package test;

import excelReader.XssfReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XssfReaderTest extends XssfReader {
    XssfReader xssfReader;
    @BeforeMethod
    public void intializedElements(){
        xssfReader = PageFactory.initElements(ad,XssfReader.class);
    }
    @Test
    public void webElementName(){// data driven test, using data from excel sheets
        List actual = xssfReader.webElementList();
        List expected = xssfReader.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }

}
