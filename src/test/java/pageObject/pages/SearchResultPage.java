package pageObject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultPage {
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private BaseFunc baseFunc;

    public SearchResultPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void openSubCategory(String subCategoryName) {
        List<WebElement> appleProducts = baseFunc.findElements(PRODUCT_TYPE);
        Assertions.assertFalse(appleProducts.isEmpty(), "Categories not found!");


        for (WebElement we : appleProducts) {
            if (we.getText().equals(subCategoryName)) {
                    baseFunc.click(we);
                break;
            }
        }
    }

}
