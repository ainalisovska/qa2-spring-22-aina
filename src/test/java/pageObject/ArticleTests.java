package pageObject;

import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;
import pageObject.pages.HomePage;

public class ArticleTests {
    private final String HOME_PAGE_URL = "tvnet.lv";

    @Test
    public void titleAndCommentsCountCheck() {
        BaseFunc baseFunc = new BaseFunc();
//        BaseFunc secondWindow = new BaseFunc();

        baseFunc.openUrl(HOME_PAGE_URL);
        HomePage homePage = new HomePage(baseFunc);

        homePage.acceptCookies();




    }

}
