package iPhone;

import SearchBarPage.SearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest extends SearchBar {
    SearchBar searchBar;
    @BeforeMethod
    public void setUp(){
        searchBar = PageFactory.initElements(ad, SearchBar.class);
    }
    @Test
    public void testPicker1() throws InterruptedException {
        searchBar.setSearchBar();
    }
}
