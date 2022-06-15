package pageObject1.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject1.ArticleTests;
import pageObject1.model.Article;

import java.util.List;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//*[text()='PIEKRĪTU']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, 'article__comment')]");
    private final By ARTICLE = By.tagName("article");

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

//    public Article getArticleById(int articleNr) {
//         List<WebElement> articlesElements = baseFunc.findElements(ARTICLE);
//        Assertions.assertFalse(articlesElements.isEmpty(), "There are no articles!");
//
//         WebElement currentArticle = articlesElements.get(articleNr - 1);
//         mapArticle(currentArticle);
//
//    }  commented because of mistake

//    WebElement -> Article
    private Article mapArticle(WebElement we) {
        Article article = new Article();

//        if there is no element with comment count -> commentsCount = 0
//        else we are getting webElement with comments count, parse to int and store it

        if (baseFunc.findElements(we, COMMENTS_COUNT).isEmpty()) {
            article.setCommentsCount(0);
        } else {
            baseFunc.findElements(we, COMMENTS_COUNT).get(0).getText();

        }

//        article.setCommentsCount(); commented because of mistake
//        article.setTitle(); commented because of mistake

        return article;


    }
}
