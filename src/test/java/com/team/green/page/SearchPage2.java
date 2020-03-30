package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class SearchPage2 extends BasePage {

    public SearchPage2(WebDriver driver) {
        super(driver);
    }

    public SearchPage2 search(String product) {
        sendKeys(INPUT, product);
        return this;
    }

    public SearchPage2 searchClick() {
        click(SEARCH);
        return this;
    }

    public String getText() {
        return getText(PRODUCT_NAMEPAGE);

    }

    public SearchPage2 productClick() {
        click(RANDOM_PRODUCT);
        return this;

    }


}
