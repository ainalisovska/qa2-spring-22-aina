package pageObject;

import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;
import pageObject.pages.HomePage;
import pageObject.pages.SearchResultPage;

public class CatalogTests {
    private final String HOME_PAGE_URL = "1a.lv";
    private final String PRODUCT_TO_FIND = "Apple";
    private final String SUBCATEGORY_TO_FIND = "Apple AirPods";
    
    @Test
    public void productDetailCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.searchFor(PRODUCT_TO_FIND);

        SearchResultPage resultPage = new SearchResultPage(baseFunc);
        resultPage.openSubCategory(SUBCATEGORY_TO_FIND);

    }
}
