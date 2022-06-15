package pageObject1;

import org.junit.jupiter.api.Test;
import pageObject1.pages.BaseFunc;
import pageObject1.pages.HomePage;

public class ArticleTests {
    private final String HOME_PAGE_URL = "tvnet.lv";

    @Test
    public void titleAndCommentsCountCheck() {
        BaseFunc baseFunc = new BaseFunc();
//        BaseFunc secondWindow = new BaseFunc();

        baseFunc.openUrl(HOME_PAGE_URL);
        HomePage homePage = new HomePage(baseFunc);

        homePage.acceptCookies();

//        homePage.getArticleById(); commented because of mistake





    }

}
